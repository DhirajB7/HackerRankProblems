package hackerrank;

import java.util.*;

public class CommonChild {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String StringOne = scan.nextLine();
		String StringTwo = scan.nextLine();

		scan.close();
		
		int countArray[][] = new int[StringOne.length() + 1][StringTwo.length() + 1];
		
		for(int i = 0 ; i <= StringOne.length() ;i++) {
			for(int j = 0 ; j <= StringTwo.length();j++ ) {
				if(i==0 || j==0) {
					countArray[i][j] = 0;
				}else if(StringOne.charAt(i-1)==StringTwo.charAt(j-1)) {
					countArray[i][j] = countArray[i-1][j-1] + 1;
				}else {
					countArray[i][j] = Math.max(countArray[i-1][j],countArray[i][j-1]);
				}
			}
		}
		
		System.out.println(countArray[StringOne.length()][StringTwo.length()]);
		
		
	}
}