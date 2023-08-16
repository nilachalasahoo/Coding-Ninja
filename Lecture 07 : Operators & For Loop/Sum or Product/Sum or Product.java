import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=sc.nextInt();
		if(c==1){
			int result=0;
			for(int i=1;i<=n;i++){
				result+=i;
			}
			System.out.print(result);
		}else if(c==2){
			int result=1;
			for(int i=1;i<=n;i++){
				result*=i;
			}
			System.out.print(result);
		}else{
			System.out.print(-1);
		}

	}
}
