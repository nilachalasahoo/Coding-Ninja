public class Solution {

	public static int findUnique(int[] arr) {
		//Your code goes here
		int n=arr.length,s=0;
		for(int i=0;i<n;i++){
			s^=arr[i];
		}
		return s;
	}
}
