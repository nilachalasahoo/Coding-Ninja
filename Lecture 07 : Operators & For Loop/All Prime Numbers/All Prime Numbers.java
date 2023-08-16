import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<=n;i++){
			int check=0;
			for(int j=2;j<i;j++){
				if(i%j==0){
					check++;
					break;
				}
			}
			if(check==0){
				System.out.println(i);
			}
		}

		
	}
}
