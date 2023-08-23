import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	private static void reverse(Queue<Integer> q,int k){
		if(k==0)
			return;
		int x=q.poll();
		reverse(q,k-1);
		q.add(x);
	}
	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		//Your code goes here
		reverse(input,k);
		for(int i=0;i<input.size()-k;i++){
			input.add(input.poll());
		}
		return input;
	}

}
