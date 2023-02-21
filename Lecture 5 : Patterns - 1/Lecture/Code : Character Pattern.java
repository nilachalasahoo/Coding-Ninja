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
			char ch=(char)('A'+i);
			while(j<=i){
				System.out.print(ch);
				j++;
				ch++;
			}
			System.out.println();
			i++;
			j=0;
		}
		
	}

}
