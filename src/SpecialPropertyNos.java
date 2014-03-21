public class SpecialPropertyNos {
	public static void main(String[] args) {
		int Limit = 4;
		for (int nos=0;nos<10;nos++){
			generateNos(nos, (Limit-1));
		}
		// int a = 10/10;
		// System.out.println("a is " +a);
	}

	private static void generateNos(int nos, int limit) {
		if (limit == 0){
			System.out.println(nos);
			return;
		}
		if ( nos%10 != 9)
			generateNos( ((nos*10)+ (nos%10+1)), (limit-1) );
		
		if( ((nos%10)-1 ) > -1 ){
			generateNos(((nos*10)+(nos%10-1)), (limit-1));
		}
	}
}
