
public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
		int n=str.length();
		String s="";
		for(int i=0;i<n-1;i++){
			if(str.charAt(i)==str.charAt(i+1))
				continue;
			s=s+str.charAt(i);
		}
		s=s+str.charAt(n-1);
		return s;

	}

}
