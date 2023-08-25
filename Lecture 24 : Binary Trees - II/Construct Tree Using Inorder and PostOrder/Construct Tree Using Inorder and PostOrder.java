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

	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		//Your code goes here
		int n=postOrder.length;
		if(n==0)
			return null;
		if(n==1)
			return new BinaryTreeNode<>(postOrder[0]);
		BinaryTreeNode<Integer> root=new BinaryTreeNode<>(postOrder[n-1]);
		int i=0;
		while(inOrder[i]!=postOrder[n-1]){
			i++;
		}
		int[] post=new int[i];
		int[] in=new int[i];
		for(int j=0;j<i;j++){
			post[j]=postOrder[j];
			in[j]=inOrder[j];
		}
		root.left=buildTree(post, in);

		post=new int[n-i-1];
		in=new int[n-i-1];
		for(int j=0;j<(n-i-1);j++){
			post[j]=postOrder[j+i];
			in[j]=inOrder[j+i+1];
		}
		root.right=buildTree(post, in);

		return root;
	}

}
