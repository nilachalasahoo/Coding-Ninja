
public class Solution {  

    private static void reverse(int[] arr,int st,int end){
        while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
    }
    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        int n=arr.length;
        if( n==0 )
            return;
        if(d>=n)
            d=d%n;
        reverse(arr,0,n-1);
        reverse(arr,0,n-d-1);
        reverse(arr,n-d,n-1);
    }

}
