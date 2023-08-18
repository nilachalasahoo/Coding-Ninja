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

	public static void printReverse(Node<Integer> root) {
		//Your code goes here
		if(root==null)
			return;
		printReverse(root.next);
		System.out.print(root.data+" ");
	}

}
