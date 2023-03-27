import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		while(i<n){
			int j=i+1;
			while(j<n){
				System.out.print(" ");
				j++;
			}
			int k=i+1;
			j=0;
			while(j<=i){
				System.out.print(k);
				k++;
				j++;
			}
			j=1;
			k=k-2;
			while(j<=i){
				System.out.print(k);
				k--;
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
