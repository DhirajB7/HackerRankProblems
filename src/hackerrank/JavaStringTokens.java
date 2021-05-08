package hackerrank;

import java.util.Scanner;

public class JavaStringTokens {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String data = scan.nextLine();

		scan.close();

		data = data.trim();

		if (data.equals("")) {

			System.out.println(0);
		} else {

			data = data.replaceAll("[ ]+", " ");

			String[] dataArray = data.split("[ .,!?@_']+");

			System.out.println(dataArray.length);

			for (String a : dataArray) {
				System.out.println(a);
			}

		}

	}
}
