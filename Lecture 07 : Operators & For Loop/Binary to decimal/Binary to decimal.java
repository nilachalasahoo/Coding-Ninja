import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=0,x=1;
		while(n!=0){
			int r=n%10;
			ans=ans+r*x;
			x=x*2;
			n/=10;
		}
		System.out.print(ans);

	}
}
