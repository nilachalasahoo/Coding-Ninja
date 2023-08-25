import java.util.LinkedList;
import java.util.Queue;
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

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root==null)
			return;
		Queue<BinaryTreeNode<Integer>> q=new LinkedList<>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()){
			root=q.remove();
			if(root==null){
				if(!q.isEmpty()){
					System.out.println();
					q.add(null);
				}
				continue;
			}
			System.out.print(root.data+" ");
			if(root.left!=null)
				q.add(root.left);
			if(root.right!=null)
				q.add(root.right);
		}
	}
	
}
