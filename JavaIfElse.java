package hackerrank;

import java.util.Scanner;

public class JavaIfElse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		scan.close();

		if (num % 2 != 0) {

			System.out.println("Weird");

		} else {

			if (num >= 2 && num <= 5) {

				System.out.println("Not Weird");

			} else if (num >= 6 && num <= 20) {

				System.out.println("Weird");

			} else {

				System.out.println("Not Weird");

			}

		}

	}

}
