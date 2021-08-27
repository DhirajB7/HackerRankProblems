package hackerrank;

import java.util.Scanner;

public class JavaStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String data = scan.nextLine();
	
		scan.close();
		
		String reverseData = "";
		
		for(int i = data.length()-1;i >=0;i--) {
			
			reverseData += String.valueOf(data.charAt(i));
			
		}
		
		System.out.println(data.equals(reverseData) ? "Yes" : "No");

	}

}
