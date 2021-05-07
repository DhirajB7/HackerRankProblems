package hackerrank;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class MaxiumElement {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		long N = Long.parseLong(scan.nextLine());
		
		Stack<Long> stl = new Stack<Long>();
		PriorityQueue<Long> pq = new PriorityQueue<Long>(Collections.reverseOrder());
		
		long maxValue = 0;
		
		for(long i = 0 ; i<N;i++) {
			String ip = scan.nextLine().trim();
			if(ip.contains(" ")) {
				int a = Integer.parseInt(ip.split(" ")[0]);
				long b = Long.parseLong(ip.split(" ")[1]);
				stl.push(b);
				pq.add(b);
			}else {
				int a = Integer.parseInt(ip);
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
