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
	private static BinaryTreeNode<Integer> helper(int[] preOrder,int st1,int end1,int[] inOrder,int st2,int end2) {
		if(st1>end1 || st2>end2)
			return null;
		BinaryTreeNode<Integer> root=new BinaryTreeNode<>(preOrder[st1]);
		int k=st2;
		while(inOrder[k]!=preOrder[st1]){
			k++;
		}
		k=k-st2;
		root.left=helper(preOrder, st1+1, st1+k, inOrder, st2, st2+k-1);
		root.right=helper(preOrder, st1+k+1, end1, inOrder, st2+k+1, end2);
		return root;
	}
	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		//Your code goes here
		return helper(preOrder,0,preOrder.length-1,inOrder,0,inOrder.length-1);
	}

}
