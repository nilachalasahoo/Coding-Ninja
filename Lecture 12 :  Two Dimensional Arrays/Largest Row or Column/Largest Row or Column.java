
public class Solution {

	public static void findLargest(int mat[][]){
		int r=Integer.MIN_VALUE,c=Integer.MIN_VALUE,a=0,b=0;
		if(mat.length==0)
			System.out.print("row "+a+" "+r);
		else{
		for(int i=0;i<mat.length;i++){
			int sum=0;
			for(int j=0;j<mat[i].length;j++){
				sum+=mat[i][j];
			}
			if(r<sum){
				r=sum;
				a=i;
			}
		}
		for(int i=0;i<mat[0].length;i++){
			int sum=0;
			for(int j=0;j<mat.length;j++){
				sum+=mat[j][i];
			}
			if(c<sum){
				c=sum;
				b=i;
			}
		}
		if(r>=c)
			System.out.print("row "+a+" "+r);
		else
			System.out.print("column "+b+" "+c);
}
	}

}
