public class MyStack<K> {
	
	private Node head;
	int length = 0;
	
	public void push(K data) {
		head = push(head, data);
		length++;
	}
	
	private Node push(Node n, K data) {
		if(n == null) {
			return new Node(data);
		}
		
		Node temp = new Node(data);
		
		temp.next = head;
		
		return temp;
	}
	
	public K pop() {
		if(head == null) {
			return null;
		}
		Node temp = head;
		head = head.next;
		return temp.data;
	}
	
	public K peek() {
		return peek(head);
	}
	
	private K peek(Node n) {
		
		if(n == null) {
			return null;
		}
		
		return head.data;
	}
	
	public void print() {
		print(head);
	}
	
	private void print(Node n) {
		while(n != null) {
			System.out.print(n.data + " ");
		}
	}
	
	private class Node{
		
		private K data;
		private Node next;
		
		public Node(K data) {
			this.data = data;
			this.next = null;
		}
		
	}

}
