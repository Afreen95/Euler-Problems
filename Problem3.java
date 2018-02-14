
public class Problem3 {
	public static void main( String [] args){
		long largestPrime = 0;
		long i = 600851475143L;
		for ( long j = 3; j < Math.sqrt(i); j += 2){
			if(i % j == 0){
				if (isPrime(j)){
					largestPrime = j;
				}
			}
		}
		System.out.println(largestPrime);
	
	}
	
	public static boolean isPrime( long a ){
		for (long k = 3; k < Math.sqrt(a); k += 2){
			if (a % k == 0){
				return false;
			}
		}
		return true;
	}
}


