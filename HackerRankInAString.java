package hackerrank;

import java.util.Scanner;

public class HackerRankInAString {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int lc = scan.nextInt();
		
		scan.nextLine();
		
		String data = "hackerrank";
		
		for(int i = 0 ; i < lc ; i++) {
			
			String ip = scan.nextLine().toLowerCase();
			
			String answer = "YES";
			
			for(int j = 0 ; j < data.length() ;j++) {
				String aplha = String.valueOf(data.charAt(j));
				int index = ip.contains(aplha) ? ip.indexOf(aplha): -1;
				if(index==-1) {
					answer = "NO";
					break;
				}else {
					ip = ip.substring(index+1);
				}
				
				
			}
			
			System.out.println(answer);
			
			
			
		}
		
		
	}

}
