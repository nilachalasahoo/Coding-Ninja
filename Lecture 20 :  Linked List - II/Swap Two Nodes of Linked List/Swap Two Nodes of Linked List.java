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

	public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
		//Your code goes here
        if(i==j)
            return head;
        Node<Integer> temp=head,p1=null,p2=null,c1=null,c2=null;
        int x=0;
        while(x<=i || x<=j){
            if(x<=i){
                p1=c1;
                c1=temp;
            }
            if(x<=j){
                p2=c2;
                c2=temp;
            }
            temp=temp.next;
            x++;
        }
        if(p1!=null)
            p1.next=c2;
        else
            head=c2;
        if(p2!=null)
            p2.next=c1;
        else
            head=c1;
        Node<Integer> root=c1.next;
        c1.next=c2.next;
        c2.next=root;
        return head;
        
        
	}

}
