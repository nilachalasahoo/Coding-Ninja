import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1,j=1;
		while(i<=n){
			while(j<=i){
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
			j=1;
		}
		
	}

}
