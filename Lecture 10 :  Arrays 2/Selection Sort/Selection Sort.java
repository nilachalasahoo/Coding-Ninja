
public class Solution {  

public static void swap(int[] arr,int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}
    public static void selectionSort(int[] arr) {
    	int n=arr.length;
        for(int i=0;i<n-1;i++){
            int c=i,x=arr[i];
            for(int j=i;j<n;j++){
                if(x>arr[j]){
                    x=arr[j];
                    c=j;
                }
            }
            swap(arr,i,c);
        }
    }   

}
