package hackerrank;

import java.util.Scanner;

public class AlternatingCharacters {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int tc = scan.nextInt();

		scan.nextLine();

		for (int i = 0; i < tc; i++) {

			String ip = scan.nextLine();

			int count = 0;

			String first = String.valueOf(ip.charAt(0));

			for (int j = 1; j < ip.length(); j++) {
				String current = String.valueOf(ip.charAt(j));

				if (first.equals(current)) {
					count++;
				} else {
					first = current;
				}
			}

			System.out.println(count);

		}

		scan.close();

	}

}
