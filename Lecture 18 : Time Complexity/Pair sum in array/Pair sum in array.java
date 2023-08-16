import java.util.Arrays;
public class Solution {	

	public static int pairSum(int[] arr, int num) {
		//Your code goes here
		Arrays.sort(arr);
		int n=arr.length-1;
		int i=0,c=0;
		while(i<n){
			if(arr[i]+arr[n]<num)
				i++;
			else if(arr[i]+arr[n]>num)
				n--;
			else{
				if(arr[n]==arr[i]){
					c+=(n-i)*(n-i+1)/2;
					break;
				}
				else{
					int st=i+1;
					int end=n-1;
					while(arr[i]==arr[st])
						st++;
					while(arr[n]==arr[end])
						end--;
					c+=(n-end)*(st-i);
					i=st;
					n=end;
				}
			}
		}
		return c;
	}
}
