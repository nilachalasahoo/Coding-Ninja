class Pair{
		LinkedListNode<Integer> head;
		LinkedListNode<Integer> tail;
	}
public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
	 * right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */

	/*
	 * LinkedList Node Class
	 *
	 * 
	 * class LinkedListNode<T> { T data; LinkedListNode<T> next;
	 * 
	 * public LinkedListNode(T data) { this.data = data; } }
	 */
	private static Pair helper(BinaryTreeNode<Integer> root){
		if(root==null){
			return new Pair();
		}
		Pair l=helper(root.left);
		if(l.head==null){
			l.head=new LinkedListNode<>(root.data);
			l.tail=l.head;
		}else{
			l.tail.next=new LinkedListNode<>(root.data);
			l.tail=l.tail.next;
		}
		Pair r=helper(root.right);
		if(r.head!=null){
			l.tail.next=r.head;
			l.tail=r.tail;
		}
		return l;
	}
	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
		return helper(root).head;
	}
}
