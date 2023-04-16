
public class Solution { 

    public static int binarySearch(int[] arr, int x) {
    	int st=0,end=arr.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(x==arr[mid]){
                return mid;
            }
            else if(x<arr[mid]){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return -1;
    }

}
