class Result{
	int max;
	int min;
	int h;
	boolean chk;
	Result(int max,int min,int h,boolean chk){
		this.max=max;
		this.min=min;
		this.h=h;
		this.chk=chk;
	}
}
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
	private static Result helper(BinaryTreeNode<Integer> root){
		if(root==null)
			return new Result(Integer.MAX_VALUE,Integer.MIN_VALUE,0,true);
		if(root.left==null&& root.right==null)
			return new Result(root.data,root.data,1,true);
		Result l=helper(root.left);
		Result r=helper(root.right);
		if(root.left==null && r.chk==true &&  r.min>root.data)
			return new Result(r.max,root.data,r.h+1,true);
		else if(root.right==null && l.chk==true && l.max<root.data)
			return new Result(root.data,l.min,l.h+1,true);
		else if(l.chk==false || r.chk==false)
			return new Result(Integer.MAX_VALUE,Integer.MIN_VALUE,Math.max(l.h,r.h),false);
		else if(l.max<root.data && r.min>root.data)
			return new Result(r.max,l.min,Math.max(l.h,r.h)+1,true);
		else
			return new Result(Integer.MAX_VALUE,Integer.MIN_VALUE,Math.max(l.h,r.h),false);
	}
	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		// Write your code here
		return helper(root).h;
	}

}
