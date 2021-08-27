package hackerrank;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int lc = scan.nextInt();

		for (int i = 0; i < lc; i++) {
			
			int number = scan.nextInt();
			
			String numString = String.valueOf(number);
			
			int answer = 0 ;
			
			for(int j = 0 ; j < numString.length();j++) {
				
				int divisor = Integer.valueOf(String.valueOf(numString.charAt(j)));
				
				if(divisor!=0) {
					if(number%divisor==0) {
						answer++;
					}
				}
				
			}
			
			System.out.println(answer);

		}
		
		scan.close();

	}

}
