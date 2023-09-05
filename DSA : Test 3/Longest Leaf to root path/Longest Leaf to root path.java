import java.util.ArrayList;

public class Solution {

/*	Binary Tree Node class
 * 
 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/
	
	public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root){
		// Write your code here
		if(root==null)
			return new ArrayList<>();
		ArrayList<Integer> l=longestRootToLeafPath(root.left);
		ArrayList<Integer> r=longestRootToLeafPath(root.right);
		if(l.size()<r.size())
			l=r;
		l.add(root.data);
		return l;
	}

	
	
}
