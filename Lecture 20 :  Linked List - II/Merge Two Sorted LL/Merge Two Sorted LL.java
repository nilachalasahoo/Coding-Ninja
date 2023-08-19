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
    
    public static Node<Integer> mergeTwoSorteds(Node<Integer> head1, Node<Integer> head2) {
        //Your code goes here
        Node<Integer> root=new Node<>(0);
         Node<Integer> temp=root;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                temp=head1;
                head1=head1.next;
            }else{
                temp.next=head2;
                temp=head2;
                head2=head2.next;
            }
        }
        if(head1!=null)
            temp.next=head1;
        if(head2!=null)
            temp.next=head2;
        return root.next;
    }

}
