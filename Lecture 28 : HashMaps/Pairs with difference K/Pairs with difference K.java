import java.util.HashMap;

public class Solution {

	public static int getPairsWithDifferenceK(int arr[], int k) {
		//Write your code here
		HashMap<Integer,Integer> map=new HashMap<>();
		int n=arr.length,c=0;
		for(int i=0;i<n;i++){
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
		if(k==0){
			for(int i=0;i<n;i++){
				c=c+(map.get(arr[i])*(map.get(arr[i])-1))/2;
				map.put(arr[i],0);
			}
			return c;
		}
		for(int i=0;i<n;i++){
			if(map.containsKey(k+arr[i]))
				c=c+map.get(arr[i])*map.get(k+arr[i]);
			if(map.containsKey(arr[i]-k))
				c=c+map.get(arr[i])*map.get(arr[i]-k);
			map.put(arr[i],0);
		}
		return c;
	}
}
