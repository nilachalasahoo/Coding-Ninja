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
	
	public static boolean isPalindrome(Node<Integer> head) {
		//Your code goes here
		Node<Integer> first=head;
		Node<Integer> last=head;
		while(last!=null && last.next!=null){
			first=first.next;
			last=last.next.next;
		}
		Node<Integer> reversed=null;
		while(first!=null){
			last=first.next;
			first.next=reversed;
			reversed=first;
			first=last;
		}
		while(reversed!=null){
			if(head.data!=reversed.data)
				return false;
			head=head.next;
			reversed=reversed.next;
		}
		return true;
	}

}
