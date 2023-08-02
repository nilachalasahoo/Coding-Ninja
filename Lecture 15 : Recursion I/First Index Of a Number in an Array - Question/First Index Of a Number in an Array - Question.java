
public class Solution {
	private static int helper(int i,int[] input,int n, int x){
		if(i==n)
			return -1;
		if(input[i]==x)
			return i;
		return helper(i+1,input,n,x);
	}
	public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return helper(0,input,input.length,x);
	}
	
}
