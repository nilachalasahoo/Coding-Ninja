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

	public static Node<Integer> evenAfterOdd(Node<Integer> head) {
		//Your code goes here
        Node<Integer> root1=new Node<>(1);
        Node<Integer> root2=new Node<>(0);
        Node<Integer> p1=root1,p2=root2;
        while(head!=null){
            if(head.data%2!=0){
                p1.next=head;
                p1=head;
            }else{
                p2.next=head;
                p2=head;
            }
            head=head.next;
        }
        p1.next=root2.next;
        p2.next=null;
        return root1.next;
	}
}
