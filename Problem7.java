
public class Problem7 {
 public static void main(String[] args){
	 long i = 2;
	 int prime = 1;
	 while (prime <= 10001){
		 if(isPrime(i)){
			 prime++;
			 i++;
		 }
		 else{
			 i++;
		 }	
	 }
	 System.out.println(i - 1); 
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


		