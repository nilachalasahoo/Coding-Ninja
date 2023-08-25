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
	private static int height(BinaryTreeNode<Integer> root){
		if(root==null)
			return 0;
		return 1+Math.max(height(root.left),height(root.right));
	}
	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
		return 1+height(root.left)+height(root.right);
	}
	
}
