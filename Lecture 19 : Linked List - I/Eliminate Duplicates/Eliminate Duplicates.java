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

	public static Node<Integer> removeDuplicates(Node<Integer> head) {
		if(head==null)
			return head;
		//Your code goes here
		Node<Integer> root=head;
		while(root.next!=null){
			if(root.data.equals(root.next.data))
				root.next=root.next.next;
			else
				root=root.next;
		}
		
		return head;
	}

}
