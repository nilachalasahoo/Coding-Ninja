
public class Solution {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        int a=arr1.length;
        int b=arr2.length;
        int n=output.length;
        int s=0;
        for(int i=n-1;i>=0;i--){
            if(a>0)
                s=s+arr1[a-1];
            if(b>0)
                s=s+arr2[b-1];
            output[i]=s%10;
            s=s/10;
            a--;
            b--;
        
        }
    }

}
