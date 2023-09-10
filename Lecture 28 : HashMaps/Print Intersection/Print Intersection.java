import java.util.HashMap;

public class Solution {

	public static void printIntersection(int[] arr1,int[] arr2){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr1.length;i++){
			map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
		}
		for(int i=0;i<arr2.length;i++){
			if(map.containsKey(arr2[i])&&map.get(arr2[i])!=0){
				System.out.println(arr2[i]);
				map.put(arr2[i],map.get(arr2[i])-1);
			}
		}
	}
}
