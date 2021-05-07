package hackerrank;

import java.util.Scanner;

public class AppendAndDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String s = scan.nextLine();

		String t = scan.nextLine();

		int k = scan.nextInt();
		
		scan.close();

		int count = 0;
		int lenDel = 0;
		int lenAppend = 0;

		int loopCount = 0;

		if (s.length() < t.length()) {

			loopCount = s.length();

		} else  {

			loopCount = t.length();

		}

		for (int i = 0; i < loopCount; i++) {
			if (s.charAt(i) == t.charAt(i)) {
				count++;
			} else {
				break;
			}
		}

		lenDel = s.length() - count;
		lenAppend = t.length() - count;

		int flag = k - lenDel - lenAppend;

		if (flag == 0) {
			System.out.println("Yes");
		} else if (flag < 0) {
			System.out.println("No");
		} else {
			if (flag % 2 == 0) {
				System.out.println("Yes");
			} else {
				if (flag >= (2 * count)) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}

			}
		}

	}
}
