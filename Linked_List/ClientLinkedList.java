package CustomLinkedList;
import java.util.*;

public class ClientLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		LinkedList<Integer> li = new LinkedList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		
		while(!li.isEmpty()) {
			
			System.out.print(li.pop() + " ==> ");
			
		}
		
		*/
		
		CustomLinkedList<Integer> li = new CustomLinkedList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		
		li.delete(40);
		
		
		
		
		
		while(!li.isEmpty()) {
			
			System.out.print(li.pop() + " ==> ");
			
		}
		
		
		
		

	}

}
