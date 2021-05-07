package hackerrank;

import java.util.Iterator;
import java.util.Scanner;

public class JavaLoopsII {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int lc = scan.nextInt();

		for (int i = 0; i < lc; i++) {

			int a = scan.nextInt();

			int b = scan.nextInt();

			int n = scan.nextInt();

			int printNumber = a + b;

			System.out.print(printNumber + " ");
			
			for (int j = 1; j < n; j++) {

				printNumber += (int) (Math.pow(2, j) * b);

				System.out.print(printNumber + " ");

			}

			System.out.println("");

		}

		scan.close();

	}

}
