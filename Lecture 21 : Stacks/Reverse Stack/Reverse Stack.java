import java.util.Stack;
public class Solution {

	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		//Your code goes here
		if(input.isEmpty())
			return;
		int x=input.pop();
		reverseStack(input,extra);
		while(!input.isEmpty()){
			extra.push(input.pop());
		}
		input.push(x);
		while(!extra.isEmpty()){
			input.push(extra.pop());
		}
	}
}
