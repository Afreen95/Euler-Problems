
public class Problem005 {
	public static void main (String[] args){
		int j = 1;
	for( int i = 2; i < 21; i++){
		j = findLCM(j , i);
		}
	System.out.println(j);
	}
	
	public static int findLCM(int a, int b){
		int min = 1, max = 1, x = 1, lcm = 1;
		if (a > b){
			max = a;
			min = b;
		}
		else{
			min = a;
			max = b;
		}
		for(int i = 1;i <= min; i++)
		   {
		    x = max * i; 
		    if(x % min == 0) 
		     {
		      lcm = x; 
		      break; 
		     }
		    }
		return lcm;
	}
}

