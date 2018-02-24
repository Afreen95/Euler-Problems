
public class Problem010 {
	
	 public static void main(String[] args){
		 long sum = 0;
		 int prime = 2;
		 while (prime <= 2000000){
			 if(isPrime(prime)){
				 sum+= prime;
			 }
			 prime++;
		 }
		 System.out.println(sum); 
	 }
	 
	 private static boolean isPrime(long a){
		 if((a != 2)&& (a % 2 == 0)){
			 return false;
		 }
		 for (long i = 3; i <= Math.sqrt(a); i += 2){
			 if (a % i == 0){
				 return false;
				 }
				 
			 }
		 return true;
		 }
	 }

