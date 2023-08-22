import java.util.Stack;
public class Solution {
	public static int countBracketReversals(String input) {
		//Your code goes here
		int n=input.length();
		if(n%2!=0)
			return -1;
		Stack<Character> st=new Stack<>();
		for(int i=0;i<n;i++){
			char c=input.charAt(i);
			if(c=='{')
				st.push(c);
			else{
				if(!st.isEmpty() && st.peek()=='{')
					st.pop();
				else
					st.push('}');
			}
		}
		n=0;
		while(!st.isEmpty()){
			char c1=st.pop();
			char c2=st.pop();
			if(c1==c2)
				n=n+1;
			else
				n=n+2;
		}
		return n;		
	}
}
