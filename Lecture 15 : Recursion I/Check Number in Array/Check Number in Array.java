public class Solution {
	private static boolean helper(int[] input,int n,int x){
		if(n==-1)
			return false;
		if(input[n]==x)
			return true;
		return helper(input,n-1,x);
	}
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return helper(input,input.length-1,x);
	}
}
