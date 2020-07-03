package hackerrank;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> mapCaps = new LinkedHashMap<Integer, String>();

		LinkedHashMap<Integer, String> mapSmall = new LinkedHashMap<Integer, String>();

		int j = 0;

		for (char i = 'a'; i <= 'z'; i++) {
			mapCaps.put(j, String.valueOf(i).toUpperCase());
			mapSmall.put(j, String.valueOf(i));
			j++;
		}

		Scanner scan = new Scanner(System.in);

		int lc = scan.nextInt();

		scan.nextLine();

		String data = scan.nextLine();
		
		char[] dataChar = data.toLowerCase().toCharArray();

		int rotate = scan.nextInt();
	
		scan.close();

		String answer = "";

		for (int i = 0; i < lc; i++) {
			String value = String.valueOf(data.charAt(i));
			char valueChar = dataChar[i];
			
			int key = valueChar - 'a' + rotate < 26 ? valueChar - 'a' + rotate : (valueChar - 'a' + rotate) % 26;
			
			if (value.matches("[a-z]")) {
				
				answer+= mapSmall.get(key);

			} else if (value.matches("[A-Z]")) {
				
				answer+= mapCaps.get(key);

			} else {
				answer += value;
			}
		}

		System.out.println(answer);
	}

}
