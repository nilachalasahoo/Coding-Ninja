
public class Solution {
	
		
     public static int staircase(int n){
		
	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	 * Taking input and printing output is handled automatically.
	 */
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		if(n==3)
			return 4;
		return staircase(n-1)+staircase(n-2)+staircase(n-3);
	}
	
}
