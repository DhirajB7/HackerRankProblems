package hackerrank;

import java.util.Scanner;

public class StrongPassword {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int len = scan.nextInt();
		
		scan.nextLine();
		
		String data = scan.nextLine();
		
		scan.close();
		
		int count = 0;
		
		if(!data.matches(".*[a-z].*")) {
			count++;
		}
		
		if(!data.matches(".*[A-Z].*")) {
			count++;
		}
		
		if(!data.matches(".*[0-9].*")) {
			count++;
		}
		
		if(!data.matches(".*[!@#$%^&*()\\-+].*")) {
			count++;
		}
		
		
		System.out.println((len+count) < 6 ? 6-len : count );
		
		
	}

}
