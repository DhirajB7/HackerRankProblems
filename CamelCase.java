package hackerrank;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String ip = scan.next();
		
		ip = ip.replaceAll("[a-z]+", "");
		
		System.out.println(ip.length()+1);

	}

}
