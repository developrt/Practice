import java.util.Random;


public class RandArr {

	int[][] nArray (int n){
		int arr[][] = new int[n][n];
		Random rand = new Random();
		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				arr[i][j] = rand.nextInt(20);
			}
		}
	     return arr;
	}
	
	public void printArr(int arr[][]){
		for (int i=0;i<arr.length;i++){
			System.out.println("");
			for (int j=0;j<arr.length;j++)
				System.out.print("	" +arr[i][j]);
		}
		
	}

}
