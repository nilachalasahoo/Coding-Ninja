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

	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root==null)
			return;
		BinaryTreeNode<Integer> left=root.left;
		root.left=new BinaryTreeNode<>(root.data);
		root.left.left=left;
		insertDuplicateNode(left);
		insertDuplicateNode(root.right);
	}
	
}
