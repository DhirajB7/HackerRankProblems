package hackerrank;

import java.util.Scanner;

public class SumXor {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		long number = scan.nextLong();
		
		scan.close();
		
		long count = 64 - Long.numberOfLeadingZeros(number) - Long.bitCount(number);

		System.out.println(1L<<count);
				
	}

}
