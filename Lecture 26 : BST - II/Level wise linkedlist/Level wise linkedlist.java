import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class Solution {
	/*
	 * BinaryTreeNode class
	 * 
	 * class BinaryTreeNode<T> 
	 * { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 *		public BinaryTreeNode(T data) 
	 *		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
	/*
	 * LinkedListNode Class
	 * class LinkedListNode<T> 
	 * { 
	 * 		T data; 
	 * 		LinkedListNode<T> next;
	 * 		public LinkedListNode(T data) 	
	 * 		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
	public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
		// Write your code here
		ArrayList<LinkedListNode<Integer>> l=new ArrayList<>();
		if(root==null)
			return l;
		LinkedListNode<Integer> head=null;
		Queue<BinaryTreeNode<Integer>> q=new LinkedList<>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()){
			root=q.remove();
			if(root==null){
				head=null;
				if(!q.isEmpty())
					q.add(null);
				continue;
			}
			if(head==null){
				head=new LinkedListNode<>(root.data);
				l.add(head);
			}else{
				head.next=new LinkedListNode<>(root.data);
				head=head.next;
			}
			if(root.left!=null)
				q.add(root.left);
			if(root.right!=null)
				q.add(root.right);
		}
		return l;
	}

}
