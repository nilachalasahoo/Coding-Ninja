
public class Solution {

	public static int countWords(String str) {	
		int x=0;
		if(str.length()==0)
			return 0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				x++;
			}
		}
		return x+1;
	}

}
