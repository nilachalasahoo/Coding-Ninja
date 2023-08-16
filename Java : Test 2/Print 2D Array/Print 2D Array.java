public class solution {
	public static void print2DArray(int input[][]) {
		int n=input.length;
		int m=input[0].length;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i;j++){
				for(int k=0;k<m;k++){
					System.out.print(input[i][k]+" ");
				}
				System.out.println();
			}
		}

	}
}
