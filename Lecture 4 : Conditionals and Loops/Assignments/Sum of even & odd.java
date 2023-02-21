import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int even=0,odd=0;
		while(n!=0){
			int r=n%10;
			if(r%2==0)
				even=even+r;
			else
				odd=odd+r;
			n=n/10;
		}
		System.out.print(even+" "+odd);
	}
}
