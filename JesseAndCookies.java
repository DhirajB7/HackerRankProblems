package hackerrank;
import java.util.PriorityQueue;
import java.util.Scanner;

public class JesseAndCookies {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long lc = scan.nextLong();

		long k = scan.nextLong();

		PriorityQueue<Long> pq = new PriorityQueue<Long>();

		for (long i = 0; i < lc; i++) {
			pq.add(scan.nextLong());
		}

		int answer = 0;
		
		boolean flag = false;

		if (pq.peek() >= k) {
			System.out.println(0); //not sure 1 or 0
		} else {
			while (pq.size()!=1) {
				if (pq.peek() < k) {
					long a = pq.poll();
					long b = pq.poll();
					pq.add(a + (2 * b));
					answer++;
					if (pq.peek() >= k) {
						flag = true;
						break;
					}
				}
			}

			System.out.println((answer > 0 && flag) ? answer : -1);
			scan.close();
		}

	}

}
