import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		//Your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1,j=1;
		while(i<=n){
			char ch=(char)('A'+n-i);
			while(j<=i){
				System.out.print(ch);
				j++;
				ch++;
			}
			System.out.println();
			i++;
			j=1;
		}
	}
}
