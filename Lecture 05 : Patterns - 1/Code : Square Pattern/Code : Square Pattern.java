import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0,j=0;
		while(i<n){
			while(j<n){
				System.out.print(n);
				j++;
			}
			System.out.println();
			j=0;
			i++;
		}
	}

}
