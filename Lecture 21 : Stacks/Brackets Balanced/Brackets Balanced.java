import java.util.Stack;
public class Solution {

    public static boolean isBalanced(String e) {
        //Your code goes here
        Stack<Character> st=new Stack<>();
        for(int i=0;i<e.length();i++){
            if(e.charAt(i)=='(')
                st.push('(');
            else{
                if(st.isEmpty())
                    return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
