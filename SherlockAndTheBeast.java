package hackerrank;

import java.util.Scanner;

public class SherlockAndTheBeast {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int lc = scan.nextInt();

		for (int i = 0; i < lc; i++) {
			{
				int number = scan.nextInt();

				StringBuilder numberInWord = new StringBuilder();

				for (int j = number; j >= 0; j--)

				{
					if (j % 3 == 0 && (number - j) % 5 == 0) {

						numberInWord.append("5".repeat(j));

						numberInWord.append("3".repeat(number-j));

						break;

					}
				}
				
				System.out.println(numberInWord.length()==0 ? "-1" : numberInWord);
			}
		}
	}

}
