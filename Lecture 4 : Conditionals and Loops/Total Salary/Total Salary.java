import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int basic=sc.nextInt();
		char ch=sc.next().charAt(0);
		double hra=basic*0.2;
		double da=basic*0.5;
		double allow;
		if(ch=='A')
			allow=1700;
		else if(ch=='B')
			allow=1500;
		else
			allow=1300;
		double pf=basic*0.11;
		int total=(int)Math.round(basic+hra+da+allow-pf);
		System.out.print(total);
	}
}
