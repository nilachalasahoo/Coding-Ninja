public class Solution {  

    public static void pushZerosAtEnd(int[] arr) {
    	int n=arr.length;
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int x=arr[i];
                arr[i]=arr[c];
                arr[c]=x;
                c++;
            }
        }
    }

}
