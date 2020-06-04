package hackerrank;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SequenceEquation {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		Scanner scan = new Scanner(System.in);
		
		int lc = scan.nextInt();
		
		int value = 1;
		
		for(int i = 0 ; i < lc ;i++) {
			
			map.put(scan.nextInt(), value);
			value++;
			
		}
		
		scan.close();
		
		int question = 1;
		
		for(int i = 0 ; i < map.size() ;i++ ) {
			
			int firstGet = map.get(question);
			
			int answer = map.get(firstGet);
			
			System.out.println(answer);
			
			question++;
		}

		

	}

}
