import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		long x=0;
		for(long i=0;i<=n;i++)
			{
				if(i*i<=n){
					x=i;
				}
			}
			System.out.print(x);
	}
}
