package hackerrank;

import java.util.Scanner;

public class EndOfFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int count = 1;
		
		while(scanner.hasNext()) {
			
			String data = scanner.nextLine();
			
			System.out.println(count+" "+data);
			
			count++;
			
		}
		
		scanner.close();

	}

}
