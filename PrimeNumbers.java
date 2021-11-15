package Day_3rd;

public class PrimeNumbers {
	
public static void main (String args[]) {
		
		int num = 11;
		int count_of_factors = 0;
		
		for (int i = 1; i<=num; i=i+1) {
			
			if(num % i ==0) {
				count_of_factors = count_of_factors + 1;
			}
		}
		
		if(count_of_factors == 2) {
			System.out.println("Prime number");
		}else {
			System.out.println("Not Prime number");
		}
	}
}
// 20 - 4,5, 2, 10, 1, 20
// 36 - 1,36, 2,18, 4,9   6
// 25 - 1,5,25 = 3
// 36 - 1,2,3,4,6,9,12,18,36 = 9
// 10 -- 1,2,5,10 == 4
