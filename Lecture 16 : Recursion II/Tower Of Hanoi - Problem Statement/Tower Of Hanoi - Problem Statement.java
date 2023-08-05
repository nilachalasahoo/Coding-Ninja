
public class solution {

	public static void towerOfHanoi(int disks, char a, char b, char c) {
		// Write your code here
		if(disks>1)
			towerOfHanoi(disks-1,a,c,b);
		if(disks!=0)
			System.out.println(a+" "+c);
		if(disks>1)
			towerOfHanoi(disks-1,b,a,c);
	}
}
