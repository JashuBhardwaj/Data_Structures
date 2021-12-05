
	
	
	//function to print list
	public static void print(Node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
			
		}
		
	}

	public static void main(String[] args) {
			
		/*
		Node<Integer> node1=new Node<>(10);
		System.out.println(node1.data);
		System.out.println(node1.next);
		
		Node<Integer> node2=new Node<>(20);
		System.out.println(node2.data);
		node1.next=node2;
		System.out.println(node2);
		System.out.println(node1.next);
		*/
		// Printing complete LinkedList
		Node<Integer> node1=new Node<>(10);
		Node<Integer> node2=new Node<>(20);
		Node<Integer> node3=new Node<>(30);
		Node<Integer> node4=new Node<>(40);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		
		Node<Integer> head=node1;
		
		print(head);
		
		
		
		 
	}

}