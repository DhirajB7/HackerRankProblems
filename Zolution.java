package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Zolution {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int lc = scan.nextInt();

		List<Integer> pq = new ArrayList<Integer>();
		
		for(int i = 0 ; i < lc ;i ++) {
			pq.add(scan.nextInt());
		}
		
		scan.close();
		
		Collections.sort(pq);
		
		int iter = pq.size(); 
				
		int len = Integer.MAX_VALUE;
		
		System.out.println(iter);
		
		for( int i = 0 ; i < iter;i++) {
			int small = pq.get(0);
			pq = pq.stream().map(a->a-small).filter(a->a > 0).collect(Collectors.toList());
			len = pq.size();
			if(len==0) {
				break;
			}else {
				System.out.println(len);
			}
		}

	}

}
