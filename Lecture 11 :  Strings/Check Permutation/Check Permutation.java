import java.util.*;
public class Solution {

	public static boolean isPermutation(String str1, String str2) {
		int n=str1.length();
		int m=str2.length();
		if(n!=m)
			return false;
		int[] f=new int[256];
		for(int i=0;i<n;i++)
			f[str1.charAt(i)]++;
		for(int i=0;i<n;i++)
			f[str2.charAt(i)]--;
		for(int i=0;i<256;i++)
			if(f[i]!=0)
				return false;
    	return true;
	}

}
