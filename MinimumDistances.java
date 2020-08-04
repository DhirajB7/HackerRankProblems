package hackerrank;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MinimumDistances {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int lc = scan.nextInt();

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < lc; i++) {
			al.add(scan.nextInt());
		}

		scan.close();

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < lc; i++) {

			int first = al.get(0);
			
			al.remove(0);

			if (al.contains(first)) {

				int index = al.indexOf(first)+1;

				if (index < min) {
					min = index;
				}

			} 

		}

		System.out.println(min);

	}

}
