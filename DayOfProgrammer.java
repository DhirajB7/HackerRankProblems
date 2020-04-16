package hackerrank;

import java.util.Scanner;

public class DayOfProgrammer {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int year = scan.nextInt();
		
		scan.close();
		
		String answer = "";
		
		if(year>1918) {
			if(year%400==0 || (year%4==0 && year%100!=0)) {
				answer = "12.09."+year;
			}else {
				answer = "13.09."+year;
			}
		}else if(year<1918) {
			if(year%4==0) {
				answer = "12.09."+year;
			}else {
				answer = "13.09."+year;
			}
		}else {
			if(year%400==0 || (year%4==0 && year%100!=0)) {
				answer = "27.09."+year;
			}else {
				answer = "26.09."+year;
			}
		}
		
		System.out.println(answer);

	}

}
