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
	
	public static int countLeafNodes(TreeNode<Integer> root){

		// Write your code here
		if(root==null)
			return 0;
		if(root.children.size()==0)
			return 1;
		int x=0;
		for(int i=0;i<root.children.size();i++)
			x+=countLeafNodes(root.children.get(i));
		return x;

	}
	
}
