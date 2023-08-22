import java.util.Stack;
public class Solution {

	public static boolean checkRedundantBrackets(String e) {
		//Your code goes here
		Stack<Character> st=new Stack<>();
		for(int i=0;i<e.length();i++){
			if(e.charAt(i)==')'){
				int c=0;
				while(st.pop()!='('){
					c++;
				}
				if(c<=1)
					return true;
			}
			st.push(e.charAt(i));
		}
		return false;
	}
}
