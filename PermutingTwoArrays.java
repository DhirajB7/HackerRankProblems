package hackerrank;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PermutingTwoArrays {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int lc = scan.nextInt();
		
		for(int i = 0 ; i < lc ;i++) {
			
			long n = scan.nextLong();
			
			long k = scan.nextLong();
			
			PriorityQueue<Long> aLong = new PriorityQueue<Long>();
			
			PriorityQueue<Long> bLong = new PriorityQueue<Long>(Collections.reverseOrder());
			
			for(long j = 0 ; j < n ; j++) {
				
				aLong.add(scan.nextLong());
				
			}
			
			for(long j = 0 ; j < n ; j++) {
				
				bLong.add(scan.nextLong());
				
			}
			
			String answer = "YES";
			
			for(long j = 0 ; j < n ; j++) {
				
				long a = aLong.poll();
				long b = bLong.poll();
				
				if(a+b < k) {
					answer = "NO";
					break;
				}
				
			}
			
			
			System.out.println(answer);
			
			aLong.clear();
			bLong.clear();
			
		}

	}

}
