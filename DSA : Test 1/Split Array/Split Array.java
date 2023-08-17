
public class solution {
	private static boolean helper(int arr[],int st,int l,int r){
		if(st!=arr.length){
			if(arr[st]%5==0)
				return helper(arr,st+1,l+arr[st],r);
			else if(arr[st]%3==0)
				return helper(arr,st+1,l,r+arr[st]);
			else
				return helper(arr,st+1,l+arr[st],r) || helper(arr,st+1,l,r+arr[st]);
		}
		if(l==r)
			return true;
		return false;
	}
	public static boolean splitArray(int input[]) {
		/* Your class should be named solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		return helper(input,0,0,0);
	}
	

}
