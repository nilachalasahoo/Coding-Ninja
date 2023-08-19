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
    
    public static Node<Integer> midPoint(Node<Integer> head) {
        //Your code goes here
        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> fast=head.next;
        while(fast!=null && fast.next!=null){
            head=head.next;
            fast=fast.next.next;
        }
        return head;
    }

}
