public class BSTTest {

	public static void main(String[] args) {
		BST<Integer, String> b = new BST<>();
		
		b.insert(8, "i m 8");
		b.insert(3, "i m 3");
		b.insert(10, "i m 10");
		b.insert(1, "i m 1 ");
		b.insert(14, "i m 14");
		b.insert(4, "i m 4");
		b.insert(7, "i m 7");
		b.insert(13, "i m 13");
		
		// PreOrder, postOrder, InOrder
		
		b.inorder();
		b.preorder();
		b.postorder();
		
		// Searching an element
		//System.out.println(b.search(3));
		//b.insert(3, "i m new 3"); // update case
		//System.out.println(b.search(3));

		//System.out.println(b.size());
		
        /*
		String s = "i am fine";
		System.out.println(s);
		String[] ss = s.split(" ");
		for (String i : ss)
			System.out.println(i);
			
		*/
		
		
		// max and min operations
		/*
		System.out.println(b.max());
		System.out.println(b.min());
		System.out.println(b.rank(6));
		System.out.println(b.rank(13));
		System.out.println(b.rank(1));
		*/
		
		
		// deleting min and max operation
		/*
		b.delMax();
        System.out.println(b.max());
        b.delMin();
        System.out.println(b.min());
        */
		
		b.zigzag();

	

	}

}
