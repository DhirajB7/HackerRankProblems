package hackerrank;

import java.util.Scanner;

public class MarsExploration {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String data = sc.nextLine();

		sc.close();

		String sos = "SOS";

		int count = 0;

		for (int i = 0; i < data.length(); i++) {

			String oneValue = i > 2 ? String.valueOf(sos.charAt(i % 3)) : String.valueOf(sos.charAt(i));

			if (!oneValue.equals(String.valueOf(data.charAt(i)))) {
				count++;
			}
		}

		System.out.println(count);

	}

}
