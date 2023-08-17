import java.util.Arrays;
public class solution {

	public static int maximumProfit(int budget[]) {
		// Write your code here
		Arrays.sort(budget);
		int max=0,n=budget.length;
		for(int i=0;i<n;i++){
			max=Math.max(max,budget[i]*(n-i));
		}
		return max;
	}

}
