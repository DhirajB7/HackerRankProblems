package hackerrank;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class RansomeNote {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int magLen = scan.nextInt();

		int ranLen = scan.nextInt();

		String ans = "YES";

		HashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();

		for (int i = 0; i < magLen; i++) {

			String key = scan.next();

			if (hm.containsKey(key)) {

				int value = hm.get(key) + 1;

				hm.put(key, value);

			} else {
				hm.put(key, 1);
			}
		}

		for (int i = 0; i < ranLen; i++) {
			
			String key = scan.next();
			
			if (hm.get(key)==null || hm.get(key)==0) {
				
				ans = "NO";
				
				break;
				
			}else {
				int value = hm.get(key) - 1;
				hm.put(key, value);
			}
			
		}
		
		System.out.println(ans);

	}

}
