
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
	
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		
		// Write your code here
		if(root==null)
			return null;
		TreeNode<Integer> ans=null;
		if(root.data>n)
			ans=root;
		for(int i=0;i<root.children.size();i++){
			TreeNode<Integer> x=findNextLargerNode(root.children.get(i),n);
			if(ans==null)
				ans=x;
			else{
				if(x!=null && x.data-n<ans.data-n)
					ans=x;
			}
		}
		return ans;
	}
	
}
