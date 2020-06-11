package hackerrank;

import java.util.Scanner;

public class SuperReducedString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String ip = scan.next();

		String oip = "";

		boolean flag = true;

		while (flag) {

			for (int i = 0; i < ip.length();) {

				char a = ip.charAt(i);

				char b = 'A';
				if (i+1  < ip.length()) {
					b = ip.charAt(i + 1);
				}

				if (a == b) {
					i += 2;
				} else {
					i += 1;
					oip += a;
				}

			}

			if (ip.length() == oip.length()) {
				flag = false;
			} else {
				ip = "";
				ip = oip;
				oip = "";
			}

		}
		
		System.out.println((oip.length()==0)?"Empty String":oip);

	}

}
