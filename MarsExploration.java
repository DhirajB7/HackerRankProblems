package hackerrank;

import java.util.Scanner;

public class MarsExploration {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String data = scan.nextLine();
		
		int count = 0;
		
		for(int i = 0 ; i < data.length() ;i = i + 3) {
			if(data.charAt(i)!='S') {
				count++;
			}
			
			if(data.charAt(i+1)!='O') {
				count++;
			}
			
			if(data.charAt(i+2)!='S') {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
