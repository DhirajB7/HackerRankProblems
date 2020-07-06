package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class BeautifulTriplets {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int lc = scan.nextInt();
		
		int diff = scan.nextInt();
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i = 0 ; i < lc ;i++) {
			al.add(scan.nextInt());
		}
		
		int count = 0;
		
		for(Integer a : al) {
			
			if(al.contains(a+diff)) {
				
				if(al.contains(a+diff+diff)) {
					count++;
				}
				
			}
			
		}
		
		System.out.println(count);
	}

}
