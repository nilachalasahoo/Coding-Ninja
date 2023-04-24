public class Solution {
	public static String reverseWordWise(String input) {
		int n=input.length();
		String s="";
		int x=n;
		for(int i=n-1;i>=0;i--){
			if(input.charAt(i)==' '){
				s=s+input.substring(i+1,x)+" ";
				x=i;
			}
		}
		s=s+input.substring(0,x);
		return s;

	}
}
