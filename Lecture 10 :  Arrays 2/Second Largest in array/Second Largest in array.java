public class Solution {  

    public static int secondLargestElement(int[] arr) {
    	int max=Integer.MIN_VALUE;
        int x=Integer.MIN_VALUE;
        int temp=x;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                x=max;
                max=arr[i];
            }else if(x<arr[i] && arr[i]!=max){
                x=arr[i];
            }
        }
        return x;
        
    }

}
