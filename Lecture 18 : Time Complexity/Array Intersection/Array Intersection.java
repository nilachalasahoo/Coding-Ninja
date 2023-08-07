import java.util.Arrays;
public class Solution {

	public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i=0,j=0,n1=arr1.length,n2=arr2.length;
		while(i<n1 && j<n2){
			if(arr1[i]==arr2[j]){
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}else if(arr1[i]<arr2[j])
				i++;
			else
				j++;
		}
	}

}
