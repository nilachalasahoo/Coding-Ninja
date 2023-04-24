
public class Solution {

	public static String reverseEachWord(String input) {
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
		String str="";
		for(int j=0;j<n;j++){
					str=s.charAt(j)+str;
				}
		return str;
	}

}
