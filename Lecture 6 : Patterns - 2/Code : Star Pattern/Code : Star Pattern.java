import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int i=n-1;
		while(i>=0){
			int j=0;
			while(j<i){
				System.out.print(" ");
				j++;
			}
			j=0;
			while(j<(2*(n-i)-1)){
				System.out.print("*");
				j++;
			}
			System.out.println();
			i--;
		}

		
	}

}
