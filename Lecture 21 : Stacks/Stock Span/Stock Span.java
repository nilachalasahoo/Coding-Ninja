import java.util.Stack;
public class Solution {

	public static int[] stockSpan(int[] price) {
		//Your code goes here
		int n=price.length;
		if(n==0)
			return new int[0];
		Stack<Integer> st1=new Stack<Integer>();
		Stack<Integer> st2=new Stack<Integer>();
		int arr[]=new int[n];
		arr[0]=1;
		st1.push(price[0]);
		for(int i=1;i<n;i++){
			if(price[i]>price[i-1]){
				int c=0;
				st2.push(price[i]);
				while(!st1.isEmpty()){
					int x=st1.pop();
					st2.push(x);
					if(x<price[i]){
						c++;
					}else{
						arr[i]=c+1;
						break;
					}
				}
				if(st1.isEmpty()){
					arr[i]=i+1;
				}
			}
			else{
				arr[i]=1;
				st1.push(price[i]);
			}
			while(!st2.isEmpty()){
				st1.push(st2.pop());
			}
		}
		return arr;
	}

}
