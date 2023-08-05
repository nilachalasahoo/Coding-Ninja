
public class Solution {
	public static int partition(int[] arr,int st,int end){
		int x=arr[end];
		int i=st;
		for(st=st;st<end;st++){
			if(arr[st]<x){
				int temp=arr[i];
				arr[i]=arr[st];
				arr[st]=temp;
				i++;
			}
		}
		arr[end]=arr[i];
		arr[i]=x;
		return i;
	}
	public static void quickSort(int[] input,int startIndex, int endIndex) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
		 if(startIndex<endIndex){
			int x= partition(input,startIndex,endIndex);
			quickSort(input,startIndex,x-1);
			quickSort(input,x+1,endIndex);
		}
	}
	
}
