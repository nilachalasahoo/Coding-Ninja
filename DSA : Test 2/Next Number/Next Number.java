/*************** 
 * Following is the Node class already written 
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}
 ***************/

public class Solution {
	private static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
		if(head==null)
			return head;
		LinkedListNode<Integer> x=head;
		LinkedListNode<Integer> reverse=null;
		while(head!=null){
			x=reverse;
			reverse=head;
			head=head.next;
			reverse.next=x;
		}
		return reverse;
	}
	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
		head=reverse(head);
		LinkedListNode<Integer> temp=head;
		LinkedListNode<Integer> prev=null;
		int x=1;
		while(temp!=null){
			x=x+temp.data;
			temp.data=x%10;
			x=x/10;
			if(x==0)
				break;
			prev=temp;
			temp=temp.next;
		}
		if(x>0){
			prev.next=new LinkedListNode<>(x);
		}
		return reverse(head);
	}
}
