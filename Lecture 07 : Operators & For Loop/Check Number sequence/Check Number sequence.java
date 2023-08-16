import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean r=false;
		int y=Integer.MAX_VALUE;
		int k=1;
		for(int i=0;i<n;i++){
			int x=sc.nextInt();
			if(k==1){
				if(y>x){
					r=true;
				}
				else{
					k=2;
					y=x;
					continue;
				}
			}
			if(k==2){
				if(x>y){
					r=true;
				}else{
					r=false;
					break;
				}
			}
			y=x;

		}
		System.out.print(r);

	}
}
