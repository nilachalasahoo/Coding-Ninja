import java.util.Arrays;
public class Solution {
	public static int findDuplicate(int[] arr) {
		//Your code goes here
		Arrays.sort(arr);
		int n=arr.length;
		if(n<=1)
			return -1;
		for(int i=1;i<n;i++){
			if(arr[i-1]==arr[i])
				return arr[i];
		}
		return -1;
	}
}
