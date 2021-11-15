package Day_3rd;

public class NumberOfFactors {
	
	public static void main (String args[]) {
		int num = 6;
		int count_of_factors = 0;
		
		for (int i = 1; i<=num; i=i+1) {
			
			if(num % i ==0) {
				count_of_factors = count_of_factors + 1;
			}
		}
		
		System.out.print(count_of_factors);
		
	}
}
