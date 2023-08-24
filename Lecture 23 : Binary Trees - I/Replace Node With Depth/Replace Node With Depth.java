/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/

public class Solution {
	private static void helper(BinaryTreeNode<Integer> root,int x){
		if(root==null)
			return;
		root.data=x;
		helper(root.left,x+1);
		helper(root.right,x+1);
	}
	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
	    //Your code goes here
		helper(root,0);
	}

}
