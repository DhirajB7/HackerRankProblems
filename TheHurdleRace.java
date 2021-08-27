package hackerrank;

import java.util.Scanner;

public class TheHurdleRace {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int lc = scan.nextInt();

		int k = scan.nextInt();

		int max = 0;

		for (int i = 0; i < lc; i++) {

			int input = scan.nextInt();

			if (input > max) {
				max = input;
			}

		}

		scan.close();

		System.out.println(max > k ? max - k : 0);

	}
}
