import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n){
			int k=(2*i)-1;
			int j=1;
			while(j<=n-i+1){
				System.out.print(k);
				k=k+2;
				j++;
			}
			k=1;
			while(j<=n){
				System.out.print(k);
				k=k+2;
				j++;
			}
			i++;
			System.out.println();
		}
	}
}
