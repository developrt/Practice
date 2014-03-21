public class Stack {

	Node top;
	
	int pop(){
		if(top != null){
			int t = top.data;
			top = top.next;
			return t;
		}
		return 0;
		
	}
	
	void push(int p){
		// if(top != null){
			Node t = new Node(p);
			t.next = top;
			top = t;
		}
		
	void sprint(){
		Node t = top;
		System.out.println();
		while(t != null){
			System.out.print(" " +t.data);
			t = t.next;
		}
	}
	
	int peek(){
		return top.data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack trstack = new Stack();
		trstack.push(10);
		trstack.push(11);
		trstack.push(12);
		trstack.sprint();
		
		trstack.peek();
		trstack.pop();
		trstack.sprint();
	}

}
