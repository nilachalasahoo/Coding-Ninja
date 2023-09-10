import java.util.HashMap;

public class Solution {

    public static int maxFrequencyNumber(int[] arr){ 
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		HashMap<Integer,Integer> map=new HashMap<>();
		int x=0;
		map.put(0,0);
		for(int i=0;i<arr.length;i++){
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
		for(int i=0;i<arr.length;i++){
			if(map.get(arr[i])>map.get(x))
				x=arr[i];
		}
		return x;
    }
}

