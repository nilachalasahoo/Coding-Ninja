
public class Solution {
	
	public static String minLengthWord(String s){
		
		int n=s.length();
		String a="",b="";
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			if(s.charAt(i)==' '){
				if(a.length()<min){
					min=a.length();
					b=a;
				}
				a="";
				continue;
			}
			a=a+s.charAt(i);
		}
		if(a.length()<min){
			b=a;
		}
		return b;

	}
}
