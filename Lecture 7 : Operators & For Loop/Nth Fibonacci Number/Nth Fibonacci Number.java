import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1,x=1;
		for(int i=1;i<n;i++){
			x=a+b;
			a=b;
			b=x;

		}
		System.out.print(x);

		
	}

}
