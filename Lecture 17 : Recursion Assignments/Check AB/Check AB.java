public class Solution {

	public static boolean checkAB(String input) {
		// Write your code here
		if(input.length()==0)
			return true;
		if(input.charAt(0)=='a'){
			if(input.length()>=3 && input.substring(1,3).equals("bb"))
				return checkAB(input.substring(3));
			else
				return checkAB(input.substring(1));
		}else
			return false;
	}
}
