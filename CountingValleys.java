package hackerrank;

import java.util.Scanner;

public class CountingValleys {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int lc = scan.nextInt();
		
		String ip = scan.next();
		
		int answer =0;
		
		int sum = 0; 
		
		for(String a:ip.split("")) {
			
			if(a.equalsIgnoreCase("U")) {
				sum+=1;
			}else {
				sum+=-1;
			}
			
			if(sum==0 && a.equalsIgnoreCase("U")) {
				answer++;
			}
			
		}
		
		System.out.println(answer);
		
	}
	
	
	

}
