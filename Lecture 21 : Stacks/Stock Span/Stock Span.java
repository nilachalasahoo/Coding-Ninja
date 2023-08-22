import java.util.Stack;
public class Solution {

	public static int[] stockSpan(int[] price) {
		//Your code goes here
		int n=price.length;
		if(n==0)
			return new int[0];
		Stack<Integer> st=new Stack<Integer>();
		int arr[]=new int[n];
		arr[0]=1;
		st.push(0);
		for(int i=1;i<n;i++){
			if(price[i]>price[st.peek()]){
				int c=0;
				while(!st.isEmpty()){
					if(price[st.peek()]<price[i]){
						st.pop();
					}else{
						arr[i]=i-st.peek();
						st.push(i);
						break;
					}
				}
				if(st.isEmpty()){
					arr[i]=i+1;
					st.push(i);
				}
			}
			else{
				arr[i]=1;
				st.push(i);
			}
		}
		return arr;
	}

}
