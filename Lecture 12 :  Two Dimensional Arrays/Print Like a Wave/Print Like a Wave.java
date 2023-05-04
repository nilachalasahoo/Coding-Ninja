
public class Solution {

	public static void wavePrint(int mat[][]){
		int n=mat.length;
		if(n==0)
			return;
		int m=mat[0].length;
		boolean x=true;
		int i=0,j=0;
		while(j<m){
			if(x){
				while(i<n){
					System.out.print(mat[i][j]+" ");
					i++;
				}
			}else{
				while(i>=0){
					System.out.print(mat[i][j]+" ");
					i--;
				}
			}
			if(i==n){
				x=false;
				i--;
				j++;
			}
			if(i<0){
				j++;
				x=true;
				i++;
			}
		}
		}
	}

