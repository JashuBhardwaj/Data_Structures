public class StackUse {

	public static void main(String[] args) {
		
		MyStack<Integer> s = new MyStack<>();
		s.push(2);
		s.push(4);
		s.push(6);
		s.push(8);
		s.push(10);
		s.push(12);
		s.print();
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.peek());
		s.print();


	}

}
