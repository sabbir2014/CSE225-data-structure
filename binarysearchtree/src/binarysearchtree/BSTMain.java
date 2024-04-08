package binarysearchtree;

public class BSTMain {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(50);
		tree.insert(20);
		tree.insert(30);
		tree.insert(70);
		tree.insert(40);
		tree.insert(80);
		tree.insert(60);
		
		System.out.println("Number of nodes : " + tree.size());
		System.out.print("Inorder traversal : [" );
		tree.inorder();
		System.out.println("]" );
		
	
		System.out.print("Preorder traversal : [" );
		tree.preorder();
		System.out.println("]" );
		

		System.out.print("Postorder traversal : [" );
		tree.postorder();
		System.out.println("]" );
		
		tree.delete(30);
		
		System.out.print("Inorder traversal : [" );
		tree.inorder();
		System.out.println("]" );
		
	
		System.out.print("Preorder traversal : [" );
		tree.preorder();
		System.out.println("]" );
		

		System.out.print("Postorder traversal : [" );
		tree.postorder();
		System.out.println("]" );
		
		System.out.println(tree.find(20));
		
		tree.delete(30);
		
		System.out.println("Height : " +tree.height());
		System.out.println("Number of nodes : " +tree.size());
		tree.insert(50);
		
		System.out.print("Inorder traversal : [" );
		tree.inorder();
		System.out.println("]" );
		
		
	}

}
