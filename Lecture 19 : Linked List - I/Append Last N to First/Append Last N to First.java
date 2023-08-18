/*

	Following is the Node class already written for the Linked List

	class Node<T> {
    	T data;
    	Node<T> next;
    
    	public Node(T data) {
        	this.data = data;
    	}
	}

*/

public class Solution {

	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		//Your code goes here
		if(n==0 || head==null)
			return head;
		Node<Integer> temp1=head;
		Node<Integer> temp2=head;
		for(int i=0;i<n;i++){
			temp1=temp1.next;
		}
		while(temp1.next!=null){
			temp2=temp2.next;
			temp1=temp1.next;
		}
		Node<Integer> root=temp2.next;
		temp2.next=null;
		temp1.next=head;
		return root;
	}

}
