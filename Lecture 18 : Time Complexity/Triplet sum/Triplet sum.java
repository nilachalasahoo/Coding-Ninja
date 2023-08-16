import java.util.Arrays;
public class Solution {	
	public static int tripletSum(int[] arr, int num) {
		//Your code goes here
		Arrays.sort(arr);
		int n=arr.length;
		int c=0;
		for(int i=0;i<n-2;i++){
			int st=i+1;
			int end=n-1;
			while(st<end){
				if(arr[i]+arr[st]+arr[end]<num)
					st++;
				else if(arr[i]+arr[st]+arr[end]>num)
					end--;
				else{
					if(arr[st]==arr[end]){
						c+=(end-st)*(end-st+1)/2;
						break;
					}
					int st_temp=st+1;
					int end_temp=end-1;
					while(st_temp<=end_temp&&arr[st]==arr[st_temp])
						st_temp++;
					while(st_temp<=end_temp&&arr[end]==arr[end_temp])
						end_temp--;
					c+=(st_temp-st)*(end-end_temp);
					st=st_temp;
					end=end_temp;
				}
			}
		}
		return c;
	}
}
