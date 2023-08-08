import java.util.Arrays;
public class Solution {	

	public static int pairSum(int[] arr, int num) {
		//Your code goes here
		Arrays.sort(arr);
		int n=arr.length-1,s=0;
		if(n<=0)
			return 0;
		s=arr[0]+arr[n];
		n--;
		for(int i=1;i<n;i++){
			if(s==num)
		}
	}
}
