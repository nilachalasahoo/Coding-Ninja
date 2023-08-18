/****************************************************************

	Following is the Node class already written for the Linked List

	class  Node<T> {
    	T data;
    	 Node<T> next;
    
    	public  Node(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
	public static Node<Integer> deleteNode( Node<Integer> head, int pos) {
		// Write your code here.
		if(head==null)
			return head;
		if(pos==0)
			return head.next;
		Node<Integer> root=head;
		while(root!=null && root.next!=null){
			if(pos==1)
				root.next=root.next.next;
			pos--;
			root=root.next;
		}
		return head;
	}
}
