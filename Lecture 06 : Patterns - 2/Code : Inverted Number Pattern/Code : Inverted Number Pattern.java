import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n>0){
			int j=0;
			while(j<n){
				System.out.print(n);
				j++;
			}
			System.out.println();
			n--;
		}
		
	}

}
