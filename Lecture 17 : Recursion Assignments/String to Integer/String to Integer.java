
public class solution {

	public static int convertStringToInt(String input){
		// Write your code here
		int n=input.length();
		if(n==1)
			return input.charAt(0)-'0';
		return convertStringToInt(input.substring(0,n-1))*10+(input.charAt(n-1)-'0');
	}
}
