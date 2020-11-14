package hackerrank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BeautifulTriplets {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int lc = scan.nextInt();
		
		int d = scan.nextInt();
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i = 0 ; i < lc ; i++) {
			queue.add(scan.nextInt());
		}
		
		scan.close();
		
		
		int count = 0;
		
		for(int i = 0 ; i < lc; i ++) {
			
			int number = queue.poll();
			
			if (queue.contains(number+d) && queue.contains(number+d+d)) {
				count++;
			}
			
		}
		
		System.out.println(count);
	}

}
