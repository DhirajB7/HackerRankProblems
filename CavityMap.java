package hackerrank;

import java.util.Scanner;

public class CavityMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[][] cArr = new int[n] [n];
		
		for(int i = 0 ; i < n ;i++) {
			String ip = scan.next();
			for(int j = 0 ; j < n ; j++) {
				cArr[i][j] = Integer.valueOf(String.valueOf(ip.charAt(j)));
			}
		}
		
		
		for(int i = 1 ; i < n-1 ;i++) {
			for(int j = 1 ; j < n-1 ; j++) {
				if(cArr[i][j] > cArr[i-1][j] && cArr[i][j] > cArr[i+1][j] && cArr[i][j] > cArr[i][j-1] && cArr[i][j] > cArr[i][j+1]) {
					cArr[i][j] = 10;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				
				if(cArr[i][j]==10) {
					System.out.print("X");
				}else {
					System.out.print(cArr[i][j]);
				}
				
				
				
			}
			System.out.println("");
			
		}
		

	}

}
