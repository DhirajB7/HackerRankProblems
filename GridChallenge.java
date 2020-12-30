package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GridChallenge {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int lc = scan.nextInt();

		ArrayList<String> al = new ArrayList<String>();

		for (int i = 0; i < lc; i++) {

			String answer = "YES";

			int numberOfString = scan.nextInt();

			scan.nextLine();

			for (int j = 0; j < numberOfString; j++) {
				char[] data = scan.nextLine().toCharArray();
				Arrays.sort(data);
				al.add(String.valueOf(data));
			}
			
			scan.close();

			for (int j = 0; j < al.get(0).length(); j++) {

				String word = "";

				for (String w : al) {
					word += String.valueOf(w.charAt(j));
				}

				char[] wordArray = word.toCharArray();

				Arrays.sort(wordArray);

				if (!word.equals(String.valueOf(wordArray))) {
					answer = "NO";
					break;
				}

			}

			System.out.println(answer);
			al.clear();

		}

	}

}
