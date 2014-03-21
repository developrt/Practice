class Node {
	Node next = null;
	int data;
	
	Node(int d){
		data = d;
		}
	
	 void append(int e){
		Node app = new Node(e);
		Node n = this;
		while(n.next != null){
			n = n.next;
			}
		n.next = app;
		}
	 
	 Node remove(int r){
		 Node n = this;
		 if(n.data == r){
			 n = n.next;
		//	 System.out.println("I am here");
			}
		 while(n.next != null){
			 if (n.next.data == r){
				 
			 }
				 
			 
		 }
		 return n;
	 }
	 
	 void lprint(){
		 Node n = this;
		 System.out.println();
		 while(n != null){
			 System.out.println(" " +n.data);
			 n = n.next;
		 }
	 }
}


public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node trlist = new Node(10);
		trlist.append(11);
		trlist.append(12);
		trlist.append(20);
		
		trlist.lprint();
		
		trlist = trlist.remove(10);
		
		trlist.lprint();
	
	}

}
