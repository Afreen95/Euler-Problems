
public class Problem006 {

	public static void main(String[] args) {
		int sumOfSquares = 0;
		for ( int i = 1; i <= 100; i++){
			sumOfSquares += (i*i); 
		}
		int sumToSquare = ((100*101)/2);
		int squareOfSum = (int) Math.pow(sumToSquare, 2);
		System.out.println(squareOfSum - sumOfSquares);

	}

}
