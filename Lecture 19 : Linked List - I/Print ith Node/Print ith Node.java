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

    public static void printIthNode(Node<Integer> head, int i){
        while(head!=null){
			if(i==0){
				System.out.print(head.data);
				return;
			}
			i--;
			head=head.next;
		}
    }
}
