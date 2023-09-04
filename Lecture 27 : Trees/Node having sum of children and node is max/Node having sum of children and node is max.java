
public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
	static class Result{
		TreeNode<Integer> head;
		int sum;
		Result(TreeNode<Integer> head,int sum){
			this.head=head;
			this.sum=sum;
		}
	}
	private static Result helper(TreeNode<Integer> root){
		if(root==null)
			return new Result(null,0);
		int sum=root.data;
		for(int i=0;i<root.children.size();i++){
			sum+=root.children.get(i).data;
		}
		TreeNode<Integer> head=root;
		for(int i=0;i<root.children.size();i++){
			Result x=helper(root.children.get(i));
			if(sum<x.sum){
				sum=x.sum;
				head=x.head;
			}
		}
		return new Result(head, sum);
	}
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		// Write your code here
		return helper(root).head;
	}
	
		
}
