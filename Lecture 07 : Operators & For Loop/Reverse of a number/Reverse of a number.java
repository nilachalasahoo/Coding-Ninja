import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=0;
		while(n!=0){
			int r=n%10;
			ans=ans*10+r;
			n/=10;
		}
		System.out.print(ans);

	}
}
