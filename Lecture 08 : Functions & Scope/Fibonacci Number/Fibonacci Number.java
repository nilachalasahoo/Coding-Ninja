public class Solution {
	
	public static boolean checkMember(int n){
				
		/* Your class should be named Solution
		* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
	 	* Taking input and printing output is handled automatically.
		*/
		int a=0,b=1;
		while(a<=n){
			if(a==n){
				return true;
			}
			b=a+b;
			a=b-a;
		}
		return false;
	}
	

}
