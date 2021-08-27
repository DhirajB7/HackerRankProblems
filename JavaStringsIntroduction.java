package hackerrank;

import java.util.Scanner;

public class JavaStringsIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String wordOne = scan.nextLine();
		
		String wordTwo = scan.nextLine();
		
		scan.close();
		
		System.out.println(wordOne.length() + wordTwo.length());
		
		System.out.println(wordOne.compareTo(wordTwo) > 0 ? "Yes" : "No");
		
		System.out.println(String.valueOf(wordOne.charAt(0)).toUpperCase()+wordOne.substring(1)+" "+String.valueOf(wordTwo.charAt(0)).toUpperCase()+wordTwo.substring(1));

	}

}
