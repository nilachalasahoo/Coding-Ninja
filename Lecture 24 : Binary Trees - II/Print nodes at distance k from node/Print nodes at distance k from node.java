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
	private static void find(BinaryTreeNode<Integer> root,int k){
		if(root==null)
			return;
		if(k==0){
			System.out.println(root.data);
			return;
		}
		find(root.left,k-1);
		find(root.right,k-1);
	}
	private static int helper(BinaryTreeNode<Integer> root,int n,int k){
		if(root==null)
			return -1;
		if(root.data==n){
			find(root,k);
			return k-1;
		}
		int x=helper(root.left,n,k);
		while(x>=0){
			if(x==0)
				System.out.println(root.data);
			find(root.right,x-1);
			return x-1;
		}
		x=helper(root.right,n,k);
		while(x>=0){
			if(x==0)
				System.out.println(root.data);
			find(root.left,x-1);
			return x-1;
		}
		return -1;
	}
	public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
	    //Your code goes here
		helper(root,node,k);
	}

}
