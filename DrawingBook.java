package hackerrank;

import java.util.Scanner;

public class DrawingBook {

	 public static void main(String[] args) {

	        Scanner scan = new Scanner(System.in);

	        int n = scan.nextInt();

	        int p = scan.nextInt();
	        
	        scan.close();

	        System.out.println(Math.min(p / 2, n / 2 - p / 2));
	    }
	
}
