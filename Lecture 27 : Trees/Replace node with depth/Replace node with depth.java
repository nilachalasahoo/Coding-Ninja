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
	private static void helper(TreeNode<Integer> root,int x){
		if(root==null)
			return;
		root.data=x;
		for(int i=0;i<root.children.size();i++)
			helper(root.children.get(i),x+1);
	}
	public static void replaceWithDepthValue(TreeNode<Integer> root){

		// Write your code here
		helper(root,0);
		
	}
	
	
}
