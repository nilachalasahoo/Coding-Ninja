

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
		TreeNode<Integer> first;
		TreeNode<Integer> second;
		Result(TreeNode<Integer> first,TreeNode<Integer> second){
			this.first=first;
			this.second=second;
		}
	}
	private static Result helper(TreeNode<Integer> root){
		if(root==null)
			return new Result(null,null);
		if(root.children.size()==0)
			return new Result(root,null);
		TreeNode<Integer> first=root;
		TreeNode<Integer> second=null;
		for(int i=0;i<root.children.size();i++){
			Result c=helper(root.children.get(i));
			if(c.first.data>first.data){
				if(c.second==null || c.second.data<first.data){
					second=first;
					first=c.first;
				}else{
					second=c.second;
					first=c.first;
				}
			}else if(first.data==c.first.data){
				if(c.second!=null&&(second==null||second.data<c.second.data))
					second=c.second;
			}else{
				if(second==null||second.data<c.first.data)
					second=c.first;
			}
		}
		return new Result(first, second);
		
	}
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
		return helper(root).second;
		// Write your code here

	}
	
	
}
