package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int lc = scan.nextInt();

		scan.nextLine();

		for (int i = 0; i < lc; i++) {

			String data = scan.nextLine();

			ArrayList<Integer> rTol = new ArrayList<Integer>();
			ArrayList<Integer> lTor = new ArrayList<Integer>();

			for (int j = 0; j < data.length() - 1; j++) {

				lTor.add(Math.abs(data.charAt(j) - data.charAt(j + 1)));

			}
			
			for(int k = data.length() -1 ; k >=1 ; k--) {
				rTol.add(Math.abs(data.charAt(k) - data.charAt(k-1)));
			}
			
			System.out.println(lTor.equals(rTol) ? "Funny" : "Not Funny");

		}

		scan.close();

	}

}
