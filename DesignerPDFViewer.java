package hackerrank;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class DesignerPDFViewer {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		LinkedHashMap<Character, Integer> lsm = new LinkedHashMap<Character, Integer>();
		
		for(char i = 'a' ; i<= 'z' ;i++) {
			lsm.put(i,scan.nextInt());
		}
		
		scan.nextLine();
		
		String data = scan.nextLine();
		
		scan.close();
		
		int max = 0;
		
		int dataLen = data.length();
		
		for(int i = 0 ; i< dataLen;i++) {
			
			int charLen = lsm.get(data.charAt(i));
			
			if(charLen > max) {
				max = charLen;
			}
		}
		
		System.out.println(max * dataLen);
	}

}
