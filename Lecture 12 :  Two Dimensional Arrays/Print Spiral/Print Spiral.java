
public class Solution {

	public static void spiralPrint(int matrix[][]){
		int n=matrix.length;
		if(n==0)
			return;
		int m=matrix[0].length;
		int c=0;
		for(int i=0;i<=n;i++){
			int j=i;
			while(j<m){
				System.out.print(matrix[i][j]+" ");
				j++;
				c++;
			}
			int k=i+1;
			while(k<n){
				System.out.print(matrix[k][m-1]+" ");
				k++;
				c++;
			}
			if(c==matrix.length*matrix[0].length)
				return;
			j=j-2;
			while(j>=i){
				System.out.print(matrix[n-1][j]+" ");
				j--;
				c++;
			}

			k=k-2;
			while(k>i){
				System.out.print(matrix[k][i]+" ");
				k--;
				c++;
			}

			n--;
			m--;
			
		}

	}
}
