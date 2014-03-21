
public class MatrixRotn {
	public static void main (String args[]){
		RandArr arr = new RandArr();
		int narr[][] = arr.nArray(10);
		System.out.println("Matrix before rotation");
		arr.printArr(narr);
		System.out.println("\n\n" +narr[narr.length-1-0][0]);
		
		int temp;
		for (int j=0;j<(narr.length)/2;j++){
		for (int i=j;i<narr.length-1-j;i++){
			temp = narr[j][i];
			narr[j][i] = narr[narr.length-1-i][j];
			//System.out.println(""+narr[narr.length-1-i][0]);
			//System.out.println(""+narr[j][i]);
			narr[narr.length-1-i][j] = narr[narr.length-1-j][narr.length-1-i];
			narr[narr.length-1-j][narr.length-1-i] = narr[i][narr.length-1-j];
			narr[i][narr.length-1-j] = temp;
			}
		}
		System.out.println("Matrix after edge rotation");
		arr.printArr(narr);
	
	}
	
	
}
