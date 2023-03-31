import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int i=0,j=1;
		while(i!=x){
			int r=3*j+2;
			if(r%4!=0){
				System.out.print(r+" ");
				i++;
			}
			j++;
		}

	}
}
