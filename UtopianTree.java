package hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class UtopianTree {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		map.put(0, 1);
		
		for(int i = 1 ; i <= 60 ;i++) {
			if(i%2==0) {
				map.put(i, map.get(i-1)+1);
			}else {
				map.put(i, map.get(i-1)*2);
			}
		}
		
		Scanner scan = new Scanner(System.in);
		
		int lc = scan.nextInt();
		
		for( int i = 0 ; i < lc ;i++) {
			int key = scan.nextInt();
			System.out.println(map.get(key));
		}
		scan.close();
		
	}

}
