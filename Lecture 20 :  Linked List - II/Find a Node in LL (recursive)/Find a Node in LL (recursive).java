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


	public static int findNodeRec(Node<Integer> head, int n) {
    	//Your code goes here
        if(head==null)
            return -1;
        if(head.data==n)
            return 0;
        int x=findNodeRec(head.next, n);
        if(x==-1)
            return -1;
        return 1+x;
	}

}
