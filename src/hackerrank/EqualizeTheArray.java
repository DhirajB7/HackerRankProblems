package hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class EqualizeTheArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int lc = scan.nextInt();

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < lc; i++) {

			int number = scan.nextInt();

			if (hm.containsKey(number)) {
				int value = hm.get(number) + 1;
				hm.put(number, value);
			} else {
				hm.put(number, 1);
			}

		}

		scan.close();

		int sum = hm.values().stream().mapToInt(a -> a).sum();

		int max = hm.values().stream().mapToInt(a -> a).max().getAsInt();

		System.out.println(sum - max);

	}

}
