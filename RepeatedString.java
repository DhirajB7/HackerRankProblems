package hackerrank;

import java.util.Scanner;

public class RepeatedString {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine(); //ip
		
		long n = scan.nextLong();  //number
		
		scan.close();
		
		long lenS = s.length(); //len s
		
		long a = s.replaceAll("[b-z]", "").length();// number of a in s
		
		long q = n/lenS;
		
		long r = n%lenS;
		
		long oldA = a * q;
		
		long newA  = s.substring(0,(int) (r)).replaceAll("[b-z]", "").length();
		
		System.out.println(oldA+newA);
		
		
	}
	
}
