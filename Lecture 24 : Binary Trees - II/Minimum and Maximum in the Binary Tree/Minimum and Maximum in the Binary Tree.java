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



/*

	Representation of the Pair Class

	class Pair<T, U> {
		T minimum;
		U maximum;

		public Pair(T minimum, U maximum) {
			this.minimum = minimum;
			this.maximum = maximum;
		}

	}

*/

public class Solution {

	public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root==null)
			return new Pair(Integer.MAX_VALUE,Integer.MIN_VALUE);
		Pair<Integer,Integer> x=getMinAndMax(root.left);
		Pair<Integer,Integer> y=getMinAndMax(root.right);
		x.minimum=Math.min(x.minimum,y.minimum);
		x.maximum=Math.max(x.maximum,y.maximum);
		x.minimum=Math.min(x.minimum,root.data);
		x.maximum=Math.max(x.maximum,root.data);
		return x;
	}	
}
