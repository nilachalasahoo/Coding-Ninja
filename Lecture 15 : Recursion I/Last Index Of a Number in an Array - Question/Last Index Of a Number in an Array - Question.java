
public class Solution {
	private static int helper(int[] input,int n,int x){
		if(n<0)
			return -1;
		if(input[n]==x)
			return n;
		return helper(input,n-1,x);
	}
	public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return helper(input,input.length-1,x);
	}
	
}
