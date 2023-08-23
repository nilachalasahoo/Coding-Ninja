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

public class Queue {
	
	//Define the data members

	Node head;
	Node tail;
	int n;
	public Queue() {
		//Implement the Constructor
		head=null;
		tail=null;
		n=0;
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


    public void enqueue(int data) {
    	//Implement the enqueue(element) function
		n++;
		if(head==null){
			head=new Node(data);
			tail=head;
			return;
		}
		tail.next=new Node(data);
		tail=tail.next;
    }


    public int dequeue() {
    	//Implement the dequeue() function
		if(isEmpty())
			return -1;
		int x=head.data;
		head=head.next;
		n--;
		return x;
    }


    public int front() {
    	//Implement the front() function
		if(isEmpty())
			return -1;
		return head.data;
    }
}
