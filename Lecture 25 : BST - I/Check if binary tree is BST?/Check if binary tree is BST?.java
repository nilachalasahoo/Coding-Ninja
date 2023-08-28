
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
	private static boolean helper(BinaryTreeNode<Integer> root,int max,int min){
		if(root==null)
			return true;
		if(root.data<max&&root.data>min){
			return helper(root.left,root.data,min)&&helper(root.right,max,root.data);
		}
		return false;
	}
	public static boolean isBST(BinaryTreeNode<Integer> root) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		return helper(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
	}

}
