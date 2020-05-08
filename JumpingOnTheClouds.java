package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class JumpingOnTheClouds {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int lc = scan.nextInt();
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i = 0 ; i < lc ; i++) {
			al.add(scan.nextInt());
		}
		
		int answer = 0;
		
		for(int i = 0 ; i < lc-1 ; i=i+0) {
			
			
			if(i+2<lc) {
				if(al.get(i+2)==0) {
					answer++;
					i=i+2;
					continue;
				}
			}
			

			if(i+1<lc) {
			if(al.get(i+1)==0){
				answer++;
				i=i+1 ;
				continue;
			}
			}
		}
		
		System.out.println(answer);
		
	}

}
