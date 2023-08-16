import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		long ans=0,x=1;
		while(n!=0){
			long r=n%2;
			ans=ans+r*x;
			x=x*10;
			n/=2;
		}
		System.out.print(ans);

	}
}
