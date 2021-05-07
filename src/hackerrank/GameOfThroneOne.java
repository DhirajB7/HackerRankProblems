package hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class GameOfThroneOne {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String data = scan.nextLine();
		
		scan.close();
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(Character a : data.toCharArray()) {
			
			if(hm.containsKey(a)) {
				int value = hm.get(a)+1;
				hm.put(a,value);
			}else {
				hm.put(a, 1);
			}
		}

		int odd = 0;
		int even = 0;
		
		for(Integer a : hm.values()) {
			if(a%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		
		if(odd==1) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
