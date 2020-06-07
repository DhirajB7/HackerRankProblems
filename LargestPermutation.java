package hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class LargestPermutation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int lc = scan.nextInt();

		int k = scan.nextInt();

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		int[] al = new int[lc];

		for (int i = 0; i < lc; i++) {

			int value = scan.nextInt();

			al[i] = value;

			hm.put(value, i);

		}

		int i = 0;
		int count = 0;

		while (i < lc && count < k) {

			int hold = hm.get(lc - i);

			if (i != hold) {
				
				hm.put(lc - i, i);
				hm.put(al[i], hold);
				
				int temp = al[i];			
				al[i] = al[hold];
				al[hold] = temp;
				count ++;
				
			}

			i++;
		}

		for (int ii = 0; ii < al.length; ii++) {
			System.out.print(al[ii] + " ");
		}

	}

}
