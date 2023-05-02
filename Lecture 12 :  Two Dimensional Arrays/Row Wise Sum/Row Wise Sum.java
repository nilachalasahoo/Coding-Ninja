
public class Solution {

	public static void rowWiseSum(int[][] mat) {
		for(int i=0;i<mat.length;i++){
			int sum=0;
			for(int j=0;j<mat[i].length;j++){
				sum+=mat[i][j];
			}
			System.out.print(sum+" ");
		}
	}

}
