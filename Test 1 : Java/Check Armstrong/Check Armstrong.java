import java.util.*;
import java.lang.Math;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		long ans=0;
		long x=n;
		int i=0;
		while(x!=0){
			i++;
			x=x/10;
		}
		x=n;
		while(x!=0){
			long r=x%10;
			ans=ans+(long)Math.pow(r,i);
			x=x/10;
		}
		if(n==ans){
			System.out.print(true);
		}else{
			System.out.print(false);
		}

	}
}
