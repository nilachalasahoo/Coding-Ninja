import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=2*n+1;j++){
				if(i==j){
					System.out.print("*");
				}else if(j==2*(n+1)-i){
					System.out.print("*");
				}
				else if(j==n+1){
					System.out.print("*");
				}else{
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}
}
