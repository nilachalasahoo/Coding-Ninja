import sun.security.util.Length;

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
	private static int Length(Node<Integer> head){
		int n=0;
		while(head!=null){
			n++;
			head=head.next;
		}
		return n;
	}
	public static Node<Integer> bubbleSort(Node<Integer> head) {
		//Your code goes here
		if(head==null || head.next==null)
			return head;
		int n=Length(head);
		for(int i=0;i<n-1;i++){
			Node<Integer> prev=null;
			Node<Integer> curr=head;
			for(int j=0;j<n-1-i;j++){
				if(curr.data<=curr.next.data){
					prev=curr;
					curr=curr.next;
				}else{
					if(prev==null){
						Node<Integer> x=curr.next;
						head=x;
						curr.next=x.next;
						head.next=curr;
						prev=head;
					}else{
						Node<Integer> x=curr.next;
						prev.next=x;
						curr.next=x.next;
						x.next=curr;
						prev=x;
					}
				}
			}
		}
		return head;
	}
}
