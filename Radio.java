package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Radio {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Long> al = new ArrayList<Long>();
		
		long lc = scan.nextLong();
		
		long k = scan.nextLong();
		
		for(long i = 0 ; i < lc;i++) {
			al.add(scan.nextLong());
		}
		
		scan.close();
		
		Collections.sort(al);
		
		int pointer = 0;
		int answer = 0;
		
		
		
		while(pointer<lc) {
			
			long tlocation = al.get(pointer)+k;
			
			while(pointer<lc && al.get(pointer)<=tlocation) {
				pointer++;
			}
			
			tlocation = al.get(pointer-1)+k;
			
			while(pointer<lc && al.get(pointer)<=tlocation) {
				pointer++;
			}
			
			answer++;
		}
		
		System.out.println(answer);
		
		
	}

}
