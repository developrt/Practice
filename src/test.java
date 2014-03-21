
public class test {
	public int a;
	test(int b){
		a = b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test n = new test(10);
		test2 n1 = new test2();
		n1.change(n.a);
		System.out.println(n.a);

	}

}

class test2{
	int c;
	void change(int k){
		k = 20;
	}
}
