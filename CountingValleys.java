package hackerrank;

import java.util.Scanner;

public class CountingValleys {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int vallyCount = 0;
		
		int lc = scan.nextInt();
		
		String data = scan.next();
		
		scan.close();
		
		boolean downFlag = false;
		
		int sum = 0;
		
		for(int i = 0 ; i < lc ;i++) {
			
			if(data.charAt(i)=='U') {
				sum += 1;
			}else {
				sum += -1;
			}
			
			if(sum==-1) {
				downFlag = true;
			}
			
			
			if(downFlag && sum==0) {
				vallyCount++;
			}
			
			if(sum==0) {
				downFlag = false;
			}
		}
		
		System.out.println(vallyCount);

	}
}
