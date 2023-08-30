/*
 * Binary Tree Node class
 * 
 * class BinaryTreeNode<T> { 
 * 		T data; 
 * 		BinaryTreeNode<T> left; 
 * 		BinaryTreeNode<T> right;
 * 		public BinaryTreeNode(T data) 
 * 		{ 
 * 			this.data = data; 
 * 		}
 * }
 */

 /* 
 * Main Method being used internally
 *	public static void main(String[] args) throws IOException {
 *		BinarySearchTree bst = new BinarySearchTree();
 *		int choice, input;
 *		int q = Integer.parseInt(br.readLine());
 *		while (q-- > 0) {
 *			st = new StringTokenizer(br.readLine());
 *			choice = Integer.parseInt(st.nextToken());
 *			switch (choice) {
 *			case 1:
 *				input = Integer.parseInt(st.nextToken());
 *				bst.insert(input);
 *				break;
 *				case 2:
 *				input = Integer.parseInt(st.nextToken());
 *				bst.remove(input);
 *				break;
 *			case 3:
 *				input = Integer.parseInt(st.nextToken());
 *				System.out.println(bst.search(input));
 *				break;
 *			default:
 *				bst.printTree();
 *				break;
 *			}
 *		}
 *	}
 */

public class BinarySearchTree {
	BinaryTreeNode<Integer> head=null;

	private BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> root,int data){
		if(root==null)
			return new BinaryTreeNode<>(data);
		if(root.data>=data){
			root.left=insert(root.left,data);
		}else{
			root.right=insert(root.right,data);
		}
		return root;
	}
	public void insert(int data) {
		//Implement the insert() function
		head=insert(head,data);
	}

	private int min(BinaryTreeNode<Integer> root){
		if(root.left==null)
			return root.data;
		return min(root.left);
	}
	private BinaryTreeNode<Integer> remove(BinaryTreeNode<Integer> root,int data){
		if(root==null)
			return root;
		if(root.data>data)
			root.left=remove(root.left,data);
		else if(root.data<data)
			root.right=remove(root.right,data);
		else{
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			else{
				root.data=min(root.right);
				root.right=remove(root.right,root.data);
			}
		}
		return root;
	}
	public void remove(int data) {
		//Implement the remove() function
		head=remove(head,data);
	}

	private void print(BinaryTreeNode<Integer> root){
		if(root==null)
			return;
		System.out.print(root.data+":");
		if(root.left!=null)
			System.out.print("L:"+root.left.data+",");
		if(root.right!=null)
			System.out.print("R:"+root.right.data);
		System.out.println();
		print(root.left);
		print(root.right);
	}
	public void printTree() {
		//Implement the printTree() function
		print(head);
	}

	private boolean search(BinaryTreeNode<Integer> root,int data){
		if(root==null)
			return false;
		if(root.data==data)
			return true;
		return search(root.left,data)||search(root.right,data);
	}
	public boolean search(int data) {
		//Implement the search() function
		return search(head,data);
	}
	

}
