import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public static void reverseQueue(Queue<Integer> input) {
		//Your code goes here
		if(input.size()==0)
			return;
		int x=input.poll();
		reverseQueue(input);
		input.add(x);
	}

}
