
public class Solution {

	public static char highestOccuringChar(String str) {
		int n=str.length(),max=0;
		char ch=str.charAt(0);
		int[] f=new int[256];
		for(int i=0;i<n;i++)
			f[str.charAt(i)]++;
		for(int i=0;i<n;i++){
			if(max<f[str.charAt(i)]){
				max=f[str.charAt(i)];
				ch=str.charAt(i);
			}
		}
		return ch;
	}

}
