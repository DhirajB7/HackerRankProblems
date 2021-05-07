package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class MinimumDistances {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int lc = scan.nextInt();
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i = 0 ; i < lc ; i++) {
			al.add(scan.nextInt());
		}
		
		scan.close();
		
		int min = Integer.MAX_VALUE;
		
		while(al.size() > 0) {
			int number = al.get(0);
			al.remove(0);
			if(al.contains(number)) {
				
				int index = al.indexOf(number);
				
				if(index < min) {
					min = index;
				}
				
			}
		}
		
		System.out.println(min==Integer.MAX_VALUE ? -1 : min+1);
		

	}

}
