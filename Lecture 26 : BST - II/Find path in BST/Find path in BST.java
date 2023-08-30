import java.util.ArrayList;

public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 * 		public BinaryTreeNode(T data) 
	 * 		{ 
	 * 			this.data = data; 
	 * 		}
	 * }
	 */

	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		 ArrayList<Integer> l=new ArrayList<>();
		if(root==null)
			return l;
		if(root.data==data){
			l.add(root.data);
			return l;
		}
		if(root.data>data){
			l=getPath(root.left, data);
			if(l.size()!=0)
				l.add(root.data);
			return l;
		}else{
			l=getPath(root.right, data);
			if(l.size()!=0)
				l.add(root.data);
			return l;
		}
	}
}
