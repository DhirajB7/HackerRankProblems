package hackerrank;

import java.util.Scanner;

public class DayOfProgrammer {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int year = scan.nextInt();

		scan.close();

		if (year == 1918) {
			System.out.println("26.09." + year);
		} else if (year < 1918) {
			if (year % 4 == 0) {
				System.out.println("12.09." + year);
			} else {
				System.out.println("13.09." + year);
			}
		} else {

			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
				System.out.println("12.09." + year);
			} else {
				System.out.println("13.09." + year);
			}

		}

	}
}
