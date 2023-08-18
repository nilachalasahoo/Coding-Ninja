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

	public static Node<Integer> insert(Node<Integer> head, int pos, int data){
		//Your code goes here
		if(pos==0){
			Node<Integer> root=new Node<Integer>(data);
			root.next=head;
			return root;
		}
		Node<Integer> root=head;
		while(root!=null){
			if(pos==1){
				Node<Integer> temp=root.next;
				root.next=new Node<Integer>(data);
				root.next.next=temp;
				return head;
			}
			pos--;
			root=root.next;
		}
		return head;
	}
}
