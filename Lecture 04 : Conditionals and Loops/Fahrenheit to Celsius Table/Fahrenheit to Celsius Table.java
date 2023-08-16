import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int st,end,jump;
		st=sc.nextInt();
		end=sc.nextInt();
		jump=sc.nextInt();

		while(st<=end){
			int res=(st-32)*5/9;
			System.out.println(st+" "+res);
			st=st+jump;
		}
	}

}
