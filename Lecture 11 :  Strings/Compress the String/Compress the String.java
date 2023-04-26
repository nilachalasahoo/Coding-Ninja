public class Solution {
	public static String getCompressedString(String str) {
		int n=str.length();
		String s="";
		int x=1;
		for(int i=0;i<n-1;i++){
			if(str.charAt(i)==str.charAt(i+1))
				x++;
			else{
				s=s+str.charAt(i);
				if(x>1){
					s=s+""+x;
					x=1;
				}
			}
		}
		s=s+str.charAt(n-1);
		if(x>1)
			s=s+""+x;
		return s;
	}

}
