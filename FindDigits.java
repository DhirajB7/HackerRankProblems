package hackerrank;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int lc = scan.nextInt();
		
		for (int i = 0; i < lc; i++) {
			
			String value = scan.next();
			
			int count = 0;
			
			for(String a : value.split("")) {
				if(Integer.valueOf(a)==0) {
					continue;
				}
				if((Integer.valueOf(value)%Integer.valueOf(a))==0) {
					count++;
				}
			}
			System.out.println(count);
			
		}

	}

}
