public class Solution {

	public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
		int n=arr.length;
		if(n==0)
			return -1;
		int s=0;
		for(int i=0;i<n;i++){
			s+=arr[i];
		}
		int x=0;
		for(int i=0;i<n;i++){
			s=s-arr[i];
			if(s==x)
				return i;
			x+=arr[i];
		}
		return -1;
	}
}
