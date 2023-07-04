

public class Solution {

	public static void leaders(int[] input) {
		int n=input.length;
		for(int i=0;i<n-1;i++){
			boolean x=true;
			for(int j=i+1;j<n;j++){
				if(input[i]<input[j]){
					x=false;
					break;
				}
			}
			if(x)
				System.out.print(input[i]+" ");
		}
		System.out.print(input[n-1]);
	}
	
}
