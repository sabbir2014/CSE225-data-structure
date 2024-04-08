package binarysearchtree;

public class BinarySearchTree {
	private Node root;
	private int count;
	
	private static class Node{
		private int key;
		private Node left,right;
		
		public Node(int elem) {
			key = elem;
			left = right = null;
		}
	}
	
	 
	public BinarySearchTree() {
		root = null;
		count = 0;
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public void insert(int key) {
		if(find(key)) {
			System.out.println("Element already in the tree!!");
		}
		else {
			root = insertrec(root,key);
			count++;
		}
	}
	
	public Node insertrec(Node root, int key) {
		if(root == null) {
			root = new Node(key);
			return root;
		}
		if(key<root.key)
			root.left = insertrec(root.left,key);
		else if (key>root.key)
			root.right = insertrec(root.right,key);
		return root;
	}
	
	public boolean find(int key) {
		return findrec(root, key);
	}
	
	public boolean findrec(Node root, int key) {
		if(root == null ) 
			return false;
		if(root.key == key)
			return true;
		else if (key < root.key)
			return findrec(root.left, key);
		else
			return findrec(root.right, key);
	}
	
	public void inorder() {
		inorderrec(root);
	}
	
	public void inorderrec(Node root) {
		if(root == null)
			return;
		else {
			inorderrec(root.left);
			System.out.print(root.key + ",");
			inorderrec(root.right);		}
	}
	
	public void preorder() {
		 preorderrec(root);
	}
	
	public void preorderrec(Node root) {
		if(root == null)
			return;
		else {
			System.out.print(root.key + ",");
			preorderrec(root.left);
			preorderrec(root.right);		}
	}
	
	public void postorder() {
		postorderrec(root);
	}
	
	public void postorderrec(Node root) {
		if(root == null)
			return;
		else {
			postorderrec(root.left);
			postorderrec(root.right);
			System.out.print(root.key + ",");
			}
	}
	
	public void delete(int key) {
		if(!find(key)) {
			System.out.println("Element already deleted!!");
		}
		else {
		root = deleterec(root,key);
		count--;
		}
	}
	
	public Node deleterec(Node root, int key) {
		if(root == null)
			return root;
		if(key<root.key)
			root.left = deleterec(root.left,key);
		else if(key>root.key)
			root.right = deleterec(root.right,key);
		else {
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			
			root.key = minvalue(root.right);
			root.right = deleterec(root.right, root.key);
			
		}
		return root;	
	}
	
	public int minvalue(Node root) {
		int min = root.key;
		while(root.left!=null) {
			min = root.left.key;
			root = root.left;
		}
		return min;
	}
	
	public int height() {
		return heightrec(root);
	}
	
	public int heightrec(Node root) {
		if(root==null) return 0;
		else
			return Math.max(heightrec(root.left), heightrec(root.right))+1;
	}
}
