
public class Problem009 {
	public static void main(String[] args){
		for (int i = 0; i < 1000; ++i){
			for (int j = 0; j < i; ++j){
				for ( int k = 0; k < j; ++k){
					if ( (Math.pow(k, 2) + Math.pow(j, 2) == Math.pow(i, 2)) && (i + j+ k == 1000)){
						System.out.println(i*j*k);
					}
				}
			}
		}
	}
}
