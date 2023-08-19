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
	
	public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
		//Your code goes here
        if(head==null || M==0)
            return null;
        Node<Integer> temp=head;
        while(temp!=null){
            for(int i=1;i<M&& temp!=null;i++){
                temp=temp.next;
            }
            if(temp==null)
                break;
            for(int i=0;i<N && temp.next!=null;i++){
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
        return head;
	}
}
