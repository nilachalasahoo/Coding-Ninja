

public class Solution {

	/*	Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	 */
	private static int height(BinaryTreeNode<Integer> root,int x){
		if(root==null)
			return 0;
		if(root.data==x)
			return 1;
		int l=height(root.left, x);
		int r=height(root.right, x);
		if(l==0&&r==0)
			return 0;
		return Math.max(l,r)+1;
	}
	private static BinaryTreeNode<Integer> parent(BinaryTreeNode<Integer> root,int x){
		if(root==null)
			return null;
		if(root.left!=null && root.left.data==x)
			return root;
		if(root.right!=null && root.right.data==x)
			return root;
		BinaryTreeNode<Integer> l=parent(root.left,x);
		if(l!=null)
			return l;
		return parent(root.right,x);
	}
	public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {
		// Write your code here
		int x=height(root,p);
		if(x==height(root,q) && x!=0 &&parent(root,p)!=parent(root,q))
			return true;
		return false;
		
	}
}
