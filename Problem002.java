
public class Problem002 {
	public static void main(String [] args){
		int sum = 0;
		int i = 0;
		int j = 1;
		int k = i + j;
		while ( k < 4000000 ){
			if ( k % 2 == 0)
			sum = sum + k;
			i = j;
			j = k;
			k = i + j;		
		}
		System.out.println(sum);
	}

}
