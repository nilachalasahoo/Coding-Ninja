import java.util.HashMap;

public class Solution {

	public static String uniqueChar(String str){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		HashMap<Character,Boolean> map=new HashMap<>();
		StringBuilder s=new StringBuilder();
		for(int i=0;i<str.length();i++){
			if(!map.containsKey(str.charAt(i))){
				map.put(str.charAt(i),true);
				s.append(str.charAt(i));
			}
		}
		return s.toString();
	}
}
