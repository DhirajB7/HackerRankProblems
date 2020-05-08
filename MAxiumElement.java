package hackerrank;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class MAxiumElement {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		long N = Long.valueOf(scan.nextLine());
		
		Stack<Long> stl = new Stack<Long>();
		PriorityQueue<Long> pq = new PriorityQueue<Long>(Collections.reverseOrder());
		
		long maxValue = 0;
		
		for(long i = 0 ; i<N;i++) {
			String ip = scan.nextLine().trim();
			if(ip.contains(" ")) {
				int a = Integer.valueOf(ip.split(" ")[0]);
				long b = Long.valueOf(ip.split(" ")[1]);
				stl.push(b);
				pq.add(b);
			}else {
				int a = Integer.valueOf(ip);
				if(a==2) {
					long b = stl.pop();
					pq.remove(b);
					
				}else {
					System.out.println(pq.peek());
				}
			}
		}
		
	}

}
