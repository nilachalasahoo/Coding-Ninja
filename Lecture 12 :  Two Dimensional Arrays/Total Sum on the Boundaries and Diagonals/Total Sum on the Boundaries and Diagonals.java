
public class Solution {

	public static void totalSum(int[][] mat) {
		int n=mat.length;
		int sum=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==0 || j==0 || i==n-1|| j==n-1)
					sum+=mat[i][j];
			}
			if(i>0&&i<n-1)
				sum+=mat[i][i];
			if(i>0&&i<n-1&&i!=n-1-i)
				sum+=mat[i][n-1-i];
		}
		System.out.println(sum);
	}

}
