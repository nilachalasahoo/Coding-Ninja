
public class Solution {
    
    public static void arrange(int[] arr, int n) {
    	int i=0,j=n-1,k=1;
        while(k<=n){
            if(k%2!=0){
                arr[i]=k;
                i++;
            }else{
                arr[j]=k;
                j--;
            }
            k++;
        }
    }
}
