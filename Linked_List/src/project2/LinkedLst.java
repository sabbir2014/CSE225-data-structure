package project2;

public class LinkedLst<T> {
	private int size;
	private Node head;
	
	public class Node<T>{
		private T data;
		private Node next;
		
		public Node(T data, Node<T> next){
			this.data = data;
			this.next = next;
		}
	}
	
	public LinkedLst() {
		size=0;
		head = null;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if (size==0) return true;
		else return false;
	}
	
	public void clear() {
		Node<T> trav = head;
		while (trav!=null) {
			Node<T> next = trav.next;
			trav.next = null;
			trav.data = null;
			trav = next;
		}
		head = null;
		size = 0;
	}
	public void reaverse() {
		Node<T> current = head, next = null, prev = null;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	
	public void addFirst(T data) {
		Node<T> node = new Node<T>(data,null);
		node.next = head;
		head =node;
		size++;
	}
	public void addLast(T data) {
		Node<T> node = new Node<T>(data,null);
		if(isEmpty())
			head = node;
		else {
			Node<T> p,q;
			for(p=head; (q=p.next) != null; p=q);
			p.next = node;
		}
		size++;
	}
	
	public void addAt(T data, int position) {   Node<T> node = new Node<T>(data, null);      if(position<0 || position>=size)    throw new IllegalArgumentException("List out of bound!");      if(isEmpty()) head = node;   else if (position == 0) {    node.next = head;    head = node;   }   else {    Node<T> temp = head;    for(int i=1; i<position; i++) temp = temp.next;    node.next = temp.next;    temp.next = node;   }      size++;  }    public void add(T data) {   addFirst(data);  }
	
	 
}
