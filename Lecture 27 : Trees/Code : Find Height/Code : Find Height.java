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

	public static int getHeight(TreeNode<Integer> root){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		if(root==null)
		 	return 0;
		int x=0;
		for(int i=0;i<root.children.size();i++){
			x=Math.max(x,getHeight(root.children.get(i)));
		}
		return x+1;
	}

}
