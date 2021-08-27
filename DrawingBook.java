package hackerrank;

import java.util.Scanner;

public class DrawingBook {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int pageNumber = scan.nextInt();
		
		int requiredPage = scan.nextInt();
		
		scan.close();
		
		if(pageNumber%2==0) {
			pageNumber++;
		}
		
		int frontToBack = 0;
		
		int backToFront = 0;
		
		for (int i = 0 ; i <= pageNumber-2 ; i=i+2) {
			
			if(requiredPage == i || requiredPage == i+1) {
				break;
			}else {
				frontToBack++;
			}
		}
		
		for(int i = pageNumber ; i >=0 ; i = i - 2) {
				
			if(requiredPage == i || requiredPage == i-1) {
				break;
			}else {
				backToFront++;
			}

		}
		
		System.out.println(Math.min(frontToBack, backToFront));

	}
	
}
