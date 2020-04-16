package hackerrank;

import java.util.Scanner;

public class RecursiveDigitSum {
	
	 static int superDigit(String n, int k) {
		 
		 int answer = 0 ;
		 
		 if(n.length()==1) {
			 return Integer.valueOf(n);
		 }else{
			 n = String.valueOf(n.chars().mapToLong(a->Character.getNumericValue(a)).sum()*k);
			 answer = superDigit(n, 1);
		 }
		 
		 return answer;
	 }
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String n = scan.next();
		
		int k = scan.nextInt();

		scan.close();
		
		System.out.println(superDigit(n,k));
		
	}

}
