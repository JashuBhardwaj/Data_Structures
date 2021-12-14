import java.util.*;

public class BST<K extends Comparable<K>, V> {
	
	private Node root;
	
	public void insert(K key, V data) {
		root = insert(root, key, data);
	}
	
	public V search(K key) {
		Node result = search(root, key);
		
		if(result == null) {
			return null;
		}
		
		return result.data;
	}
	
	private Node search(Node n, K key) {
		if(n == null ) {
			return null;
		}
		
		int cmp = key.compareTo(n.key);
		
		if(cmp == 0) {
			return n;
		}
		if(cmp > 0) {
			return search(n.right, key);
		}
		else {
			return search(n.left , key);
		}
	}
	
	private Node insert(Node n, K key, V data) {
		if(n == null) {
			return new Node(key, data);
		}
		int cmp = key.compareTo(n.key);
		
		if(cmp == 0) {
			n.data = data;
			//return n;
		}
		else if(cmp > 0) {
			n.right = insert(n.right, key, data);
		}
		else {
			n.left = insert(n.left, key, data);
		}
		
		n.size = 1 + sizeOf(n.left) + sizeOf(n.right);
		return n;
	}
	
    public int size() {
		return sizeOf(root);
	}
	private int sizeOf(Node n) {
		
		if(n == null) {
			return 0;
		}
		
		return n.size;
	}
	
	public int rank(K key) {
		
		return rank(root, key);
	}
	
	public K max() {
		
		return max(root);
	}
	
	private K max(Node n) {
		
		if(n.right == null) {
		    return n.key;
		}
		
		return max(n.right);
	}
	
	public K min() {
		return min(root);
	}
	
	private K min(Node n) {
		if(n.left == null) {
			return n.key;
		}
		
		return min(n.left);
	}
	
	public void delMax() {
		root = delMax(root);
	}
	
	private Node delMax(Node n) {
		
		if(n.right == null) {
			return n.left;
		}
		
		n.right = delMax(n.right);
		return n;
	}
	
	public void delMin() {
		root = delMin(root);
	}
	
	private Node delMin(Node n) {
		
		if(n.left == null) {
			return n.right;
		}
		
		n.left = delMin(n.left);
		return n;
	}
	
	
	
	
	private int rank(Node n, K key) {
		
		int cmp = key.compareTo(n.key);
		
		if(cmp == 0) {
			return 1 + sizeOf(n.left);
		}
		
		if(cmp < 0) {
			return rank(n.left, key);
		}
		
		return 1 + sizeOf(n.left) + rank(n.right, key);
		
	}
	
	public void inorder() {
		System.out.print("Inorder : ");
		inorder(root);
		System.out.println();
	}
	
	private void inorder(Node n) {
		
		if(n == null) {
			return;
		}
		
		inorder(n.left);
		System.out.print(n.key + " ");
		inorder(n.right);
		
	}
	
	
	public void preorder() {
		System.out.print("Preorder : ");
		preorder(root);
		System.out.println();
	}
	
	private void preorder(Node n) {
		
		if(n == null) {
			return;
		}
		
		System.out.print(n.key + " ");
		preorder(n.left);
		preorder(n.right);
	}
	
	
	public void postorder() {
		System.out.print("Postorder : ");
		postorder(root);
		System.out.println();
	}
	
	private void postorder(Node n) {
		
		if(n == null) {
			return;
		}
		
		postorder(n.left);
		postorder(n.right);
		System.out.print(n.key + " ");
	}
	
	
	public void zigzag() {
		
		System.out.print("Zigzag : ");
		zigzag(root);
		System.out.println();
	}
	
	
	private void zigzag(Node n) {
		
		if(n == null) return;
		
		Stack<Node> main = new Stack<Node>();
		Stack<Node> sec = new Stack<Node>();
		int leftToright = 1;
		main.push(n);
		
		while(!main.isEmpty()) {
			
			while(!main.isEmpty()) {
				
				Node t = main.pop();
				
				if(leftToright == 1) {
					
					if(t.left != null) sec.push(t.left);
					if(t.right != null) sec.push(t.right);
				}
				
				else if(leftToright == -1) {
					
					if(t.right != null) sec.push(t.right);
					if(t.left != null) sec.push(t.left);
				}
				
				System.out.print(t.key + " ");
				
				
			}
			
			leftToright *= -1;
			
			Stack<Node> temp = main;
			main = sec;
			sec = temp;
			
		}
			
	}
	
	
	public void topView() {
		
		topView(root);
	}
	
	private void topView(Node n) {
		
		if(n == null) return;
		
		int index = 0;
		
		Pair p = new Pair(root, 0);
		HashMap<Integer, K> hm = new HashMap<Integer, K>();
		Queue<Pair> q = new LinkedList<Pair>();
		q.add(p);
		
		while(!q.isEmpty()) {
			
			Pair temp = q.poll();
			
			if(!hm.containsKey(temp.index)) {
				
				hm.put(temp.index, temp.key);
			}
			index = temp.index;
			
			if(temp.right != null) q.add(new Pair(temp.right, ++index));
			if(temp.left != null) q.add(new Pair(temp.left, --index));
		}
		
		
	}
	
	private class Pair{
		private K key;
		private V data;
		private Node left;
		private Node right;
		private int index;
		
		Pair(Node n, int index){
			this.key = n.key;
			this.data = n.data;
			this.left = null;
			this.right = null;
			this.index = index;
		}
	}
	
	
	private class Node{
		private K key;
		private V data;
		private Node left;
		private Node right;
		private int size;
		
		public Node(K key, V data) {
			this.key = key;
			this.data = data;
			this.left = null;
			this.right = null;
			this.size = 1;
		}
	}

}
