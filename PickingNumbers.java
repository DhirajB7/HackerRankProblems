package hackerrank;

import java.util.PriorityQueue;
import java.util.Scanner;

public class PickingNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		int lc = scan.nextInt();

		for (int i = 0; i < lc; i++) {
			pq.add(scan.nextInt());
		}

		scan.close();

		int minValue = pq.poll();

		int count = 1;

		int max = 0;

		for (int i = 0; i < lc - 1; i++) {

			int number = pq.poll();

			if (number - minValue < 2) {

				count++;

			} else {

				count = 1;
				minValue = number;

			}
			max = Math.max(max, count);
		}

		System.out.println(max);

	}
}
