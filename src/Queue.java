
public class Queue {

	Node first;
	Node last;
	
	void enque(int e){
		if (first == null){
			first = new Node(e);
			last = first;
		}
		else{
		Node t = new Node(e);
		last.next = t;
		last = last.next;
		}
	}
	
	void qprint(){
		System.out.println();
		Node t = first;
		while(t != null){
			System.out.print(" " +t.data);
			t = t.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue trq = new Queue();
		trq.enque(10);
		trq.enque(15);
		trq.enque(20);
		trq.qprint();
	}

}
