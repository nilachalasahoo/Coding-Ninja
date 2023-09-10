import java.util.*;

public class Solution {
	public static int PairSum(int[] arr, int size) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<size;i++){
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
		int ans=0;
		if(map.containsKey(0)){
			ans=map.get(0)*(map.get(0)-1)/2;
			map.put(0,0);
		}
		for(int i=0;i<size;i++){
			if(map.containsKey(-1*arr[i]))
				ans=ans+(map.get(arr[i])*map.get(-1*arr[i]));
			map.put(arr[i],0);
		}
		return ans;
	}
}

