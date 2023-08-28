public class Solution {

	/*	Binary Tree Node class 
	 * 
	 * 	class BinaryTreeNode<T> {
			T data;
			BinaryTreeNode<T> left;
			BinaryTreeNode<T> right;
			
			public BinaryTreeNode(T data) {
				this.data = data;
			}
		}
		*/
		private static BinaryTreeNode<Integer> helper(int arr[],int i,int n){
			if(i>n)
				return null;
			int x=i+(n-i)/2;
			BinaryTreeNode<Integer> root=new BinaryTreeNode<>(arr[x]);
			root.left=helper(arr,i,x-1);
			root.right=helper(arr,x+1,n);
			return root;
		}
		public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
			return helper(arr,0,n-1);
		}
	}
