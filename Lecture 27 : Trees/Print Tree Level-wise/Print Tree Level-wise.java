import java.util.LinkedList;
import java.util.Queue;

public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
	
	
	public static void printLevelWise(TreeNode<Integer> root){
		/* Your class should be named Solution 
 		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
		if(root==null)
			return;
		Queue<TreeNode<Integer>> q=new LinkedList<>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()){
			root=q.remove();
			if(root==null){
				System.out.println();
				if(!q.isEmpty())
					q.add(null);
				continue;
			}
			System.out.print(root.data+" ");
			for(int i=0;i<root.children.size();i++)
				q.add(root.children.get(i));
		
		}

	}
		
}
