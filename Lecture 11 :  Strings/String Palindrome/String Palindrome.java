
public class Solution {

	public static boolean isPalindrome(String str) {
		int n=str.length();
		int x=n-1;
		for(int i=0;i<n/2;i++){
			if(str.charAt(i)!=str.charAt(x))
				return false;
			x--;
		}
		return true;

	}

}
