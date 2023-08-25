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
		Queue<BinaryTreeNode<Integer>> q=new LinkedList<>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()){
			root=q.remove();
			if(root==null){
				if(!q.isEmpty()){
					q.add(null);
				}
				continue;
			}
			if(root.left!=null){
				q.add(root.left);
				System.out.print(root.data+":L:"+root.left.data);
			}else{
				System.out.print(root.data+":L:"+-1);
			}
			if(root.right!=null){
				q.add(root.right);
				System.out.println(",R:"+root.right.data);
			}else{
				System.out.println(",R:"+-1);
			}
		}
	}
	
}
