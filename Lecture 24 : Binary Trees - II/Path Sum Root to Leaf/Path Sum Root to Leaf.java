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
	private static void helper(BinaryTreeNode<Integer> root,String s,int k){
		if(root==null)
			return;
		k=k-root.data;
		if(root.left==null && root.right==null){
			if(k==0)
				System.out.println(s+root.data+" ");
			return;
		}
		helper(root.left,(s+root.data+" "),k);
		helper(root.right,(s+root.data+" "),k);

	}
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		//Your code goes here
		helper(root,"",k);
	}

}
