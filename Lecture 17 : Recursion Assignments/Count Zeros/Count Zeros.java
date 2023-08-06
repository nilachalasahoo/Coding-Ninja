
public class solution {
	public static int count(String s){
		if(s.length()==0)
			return 0;
		if(s.charAt(0)=='0')
			return 1+count(s.substring(1));
		else
			return count(s.substring(1));
	}
	public static int countZerosRec(int input){
		// Write your code here
		return count(Integer.toString(input));
	}
}
