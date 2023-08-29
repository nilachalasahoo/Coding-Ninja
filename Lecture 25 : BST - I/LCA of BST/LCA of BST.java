public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T> right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */
	
	public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
		if(root==null)
			return -1;
		if(root.data==a || root.data==b)
			return root.data;
		if(root.data>a && root.data>b)
			return  getLCA(root.left, a, b);
		if(root.data<a && root.data<b)
			return getLCA(root.right, a, b);
		int l=getLCA(root.left, a, b);
		int r=getLCA(root.right, a, b);
		if(l!=-1 && r!=-1)
			return root.data;
		if(l!=-1)
			return l;
		else
			return r;
	}
}
