import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n){
			int sum=1,j=2;
			System.out.print(1);
			while(j<=i){
				System.out.print("+"+j);
				sum=sum+j;
				j++;
			}
			System.out.println("="+sum);
			i++;
		}
	}
}
