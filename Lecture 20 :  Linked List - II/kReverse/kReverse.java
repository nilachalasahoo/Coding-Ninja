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
    public static Node<Integer> reverse(Node<Integer> root){
        if(root.next==null)
            return root;
        Node<Integer> x=root;
        Node<Integer> y=root.next;
        root.next=null;
        root=reverse(y);
        y.next=x;
        return root;
    }
	public static Node<Integer> kReverse(Node<Integer> head, int k) {
		//Your code goes here
        if(head==null || head.next==null || k==0 || k==1)
            return head;
        Node<Integer> temp=head;
        for(int i=1;i<k;i++){
            if(temp.next==null)
                break;
            temp=temp.next;
        }
        Node<Integer> root=temp.next;
        temp.next=null;
        temp=reverse(head);
        head.next=kReverse(root,k);
        return temp;
	}

}
