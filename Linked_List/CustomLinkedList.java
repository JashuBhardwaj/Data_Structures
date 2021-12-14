package CustomLinkedList;

public class CustomLinkedList<Value> {

	private Node root;
	private int n;
	
	class Node{
		private Value value;
		private Node next;
		
		Node(Value value, Node next){
			this.value = value;
			this.next = next;
		}
	}
	
	public void add(Value value) {
		root = new Node(value, root);
		n++;
	}
	
	public boolean isEmpty() {
		return n == 0;
		
	}
	
	public void delete(Value value) {
		
		Node temp = null;
		Node x = null;
		
		for(x = root; x != null; temp = x, x = x.next) {
			
			if(x.value == value) {
				
				break;
				
			}
		}
		
		if(x != null) {
			
			if(x.next == null) {
				temp.next = null;
			}
			else if(x.next != null) {
				temp.next = x.next;
			}
			
			n--;
			
		}
	}
	
	public Value pop() {
		
		Value temp = root.value;
		
		root = root.next;
		n--;
		return temp;
	}
	
	public boolean contains(Value value) {
		
		
		for(Node x = root; x != null; x = x.next) {
			
			if(x.value == value) {
				return true;
			}
		}
		
		return false;
	}
}
