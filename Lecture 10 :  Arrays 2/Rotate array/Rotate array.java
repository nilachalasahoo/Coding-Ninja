
public class Solution {  

    public static void rotate(int[] nums, int k) {
    	int n=nums.length;
        int arr[]=new int[n];
        int j=0;
        if(k<=n){
        for(int i=0;i<n;i++){
            if(k<n){
            arr[i]=nums[k];
            k++;
            }
            else{
                arr[i]=nums[j];
                j++;
            }
        }
        for(int i=0;i<n;i++){
            nums[i]=arr[i];
        }
        }
    
    }

}
