package hackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Pangrams {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] ip = scan.nextLine().toLowerCase().replaceAll("[ ]+", "").split("");
		
		HashSet<String> set = new HashSet<String>();
		
		for(int i = 0 ; i < ip.length;i++) {
			set.add(ip[i]);
		}	
		System.out.println( set.size()==26 ? "pangram" : "not pangram");

	}

}
