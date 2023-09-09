import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		HashMap<Integer,Boolean> map=new HashMap<>();
		for(int i=0;i<arr.length;i++){
			map.put(arr[i],true);
		}
		ArrayList<Integer> l=new ArrayList<>();
		int c1=0;
		for(int i=0;i<arr.length;i++){
			int c2=1;
			int x=arr[i]+1;
			while(map.containsKey(x)){
				x++;
				c2++;
			}
			if(c2>c1){
				l=new ArrayList<>();
				l.add(arr[i]);
				if(c2!=1){
					l.add(x-1);
				}
				c1=c2;
			}
		}
		return l;

    }
}
