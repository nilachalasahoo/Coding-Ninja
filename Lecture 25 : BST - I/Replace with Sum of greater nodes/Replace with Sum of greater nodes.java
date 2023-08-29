public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
	 * right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */
	private static int  helper(BinaryTreeNode<Integer> root,int x){
		if(root==null)
			return x;
		x=helper(root.right,x);
		root.data=x+root.data;
		x=helper(root.left,root.data);
		return x;
	}
	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		// Write your code here
		helper(root,0);
	}
}
