
public class Solution {

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		String s="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=ch)
				s=s+str.charAt(i);
		}
		return s;
	}

}
