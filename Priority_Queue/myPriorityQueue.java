// Max Heap Priority Queue

class MyPQ<Key> {
	
	private int n;
	private Key[] pq;
	
	MyPQ(){
		this(1);
	}
	
	MyPQ(int initcap){
		pq = (Key[]) new Object[initcap + 1];
	}
	
	public void add(Key elem) {
		if(n == this.pq.length - 1) this.resize(2 * this.pq.length);
		this.pq[++n] = elem;
		swim(n);
		
	}
	
	private boolean less(int i, int j) {
		return ((Comparable<Key>)this.pq[i]).compareTo(this.pq[j]) < 0;
	}
	
	private void swim(int k) {
		
		while(k > 1) {
			if(less( k/2 , k)) {
				exch(k, k/2);
			}
			
			k = k/2;
		}
	}
	
	public Key poll() {
		Key maxElem = this.pq[1];
		
		exch(1, n--);
		sink(1);
		pq[n + 1] = null;
		
		if(this.n > 0 && this.n < this.pq.length / 4) this.resize(this.pq.length / 2);
		
		return maxElem;
	}
	
	private void sink(int k) {
		
	    int j;
		while(2*k <= n) {
			
			j = 2*k;
			if(j < n && less(j, j + 1)) j++;
			if(less(j, k)) break;
			else {
				exch(j, k);
			}
			
			k = j;
		}
		
	}
	
	
	private void exch(int i, int j) {
		
		Key temp = this.pq[i];
		this.pq[i] = this.pq[j];
		this.pq[j] = temp;
	}
	
	public boolean isEmpty() {
		return (pq[1] == null);
	}
	
	private void resize(int cap) {
		
		Key temp[] = (Key[]) new Object[cap];
		
		for(int i = 0; i <= n; i++) {
			temp[i] = pq[i];
		}
		
		pq = temp;
	}
	
	public int getSize() {
		return this.n;
	}
	
	public Key peek() {
		return pq[1];
	}
	
	
}

public class MyPriorityQueue {

	public static void main(String[] args) {
		
	    MyPQ<Integer> pq = new MyPQ<Integer>(7);
	    pq.add(20);
	    pq.add(10);
	    pq.add(9);
	    pq.add(26);
	    pq.add(7);
	    pq.add(6);
	    pq.add(1);
	    
	    System.out.println(pq.peek());
	    
	    System.out.println(pq.poll());
	    
	    System.out.println(pq.peek());
	    
	    System.out.println(pq.poll());
	    
	    pq.add(31);
	    
	    System.out.println(pq.peek());
	    
	   
	}

}
