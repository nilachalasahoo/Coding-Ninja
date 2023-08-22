
/*
    Following is the structure of the node class for a Singly Linked List

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

*/

public class Stack {

    //Define the data members
    Node head;
    int n;

    public Stack() {
        head=null;
        n=0;
        //Implement the Constructor
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        return n;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return n==0;
    }

    public void push(int element) {
        //Implement the push(element) function
        Node x=head;
        head=new Node(element);
        head.next=x;
        n++;
    }

    public int pop() {
        //Implement the pop() function
        if(head==null)
            return -1;
        int x=head.data;
        head=head.next;
        n--;
        return x;
    }

    public int top() {
        //Implement the top() function
        if(head==null)
            return -1;
        return head.data;
    }
}
