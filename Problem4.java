public class Problem4 {
	public static void main(String[] args){
		int max = 0;
	for (int i = 999; i > 100; i--){
		for( int j = 999; j > 100; j --){
			if(isPalindrome(i*j)){
				if( i * j > max){
					max = i*j;
				}
			}
		}
	}
	System.out.println(max);
	}
	
	public static boolean isPalindrome(int a){
		String number = a + "";
		String reverse = new StringBuffer(number).reverse().toString();
		if(number.equals(reverse)){
			return true;
		}
		return false;
		
	}
}
