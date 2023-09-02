import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;
public class Solution {
	/*
	 * BinaryTreeNode class
	 * 
	 * class BinaryTreeNode<T> 
	 * { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 *		public BinaryTreeNode(T data) 
	 *		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
	
	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
		// Write your code here
		if(root==null)
			return;
		Queue<BinaryTreeNode<Integer>> q=new LinkedList<BinaryTreeNode<Integer>>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()){
			root=q.remove();
			if(root==null){
				if(!q.isEmpty())
					q.add(null);
				continue;
			}
			list.add(root.data);
			if(root.left!=null)
				q.add(root.left);
			if(root.right!=null)
				q.add(root.right);
		}
		
		Collections.sort(list);
		int n=list.size()-1;
		int i=0;
		while(i<n){
			if((list.get(i)+list.get(n))<s)
				i++;
			else if((list.get(i)+list.get(n))>s)
				n--;
			else{
				System.out.println(list.get(i)+" "+list.get(n));
				i++;
				n--;
			}
		}
	}

}
