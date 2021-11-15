package Day_3rd;

public class OddEven {
	
public static void main (String args[]) {
		
		// find whether a no. is odd or even
		
	   //  15 % 2 = 1
		
		// 30 % 6 = 0
		
		// 30 % 7 = 2
		
		// 10 % 7 = 3
		
		// 6 % 10 = 6
		
		// num % 2  == 0, number is even, else odd
		
		
		int num = 9310;
		
		if(num % 2 ==0) {
			System.out.print("Even");
		}else {
			System.out.print("Odd");
		}
	}

}
