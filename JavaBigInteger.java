package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		String first = scan.nextLine();
		
		String second = scan.nextLine();
		
		scan.close();
		
		BigInteger firstBi = new BigInteger(first);
		
		BigInteger secondBi = new BigInteger(second);
		
		System.out.println(firstBi.add(secondBi));
		
		System.out.println(firstBi.multiply(secondBi));
		

	}

}
