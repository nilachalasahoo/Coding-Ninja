import java.util.HashMap;

public class Solution {

	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		// Write your code here
		int x=0;
		int sum=0;
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(0,-1);
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
			if(map.containsKey(sum))
				x=Math.max(x,i-map.get(sum));
			else
				map.put(sum,i);
		}
		return x;
	}
}
