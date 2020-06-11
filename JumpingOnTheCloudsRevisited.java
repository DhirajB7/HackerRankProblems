package hackerrank;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class JumpingOnTheCloudsRevisited {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int lc = scan.nextInt();

		int k = scan.nextInt();

		HashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

		for (int i = 0; i < lc; i++) {
			map.put(i, scan.nextInt());
		}

		int index = 0;

		int energy = 100;
		
		if(lc==k) {
			index = (index + k)%lc;
		}else {
			index += k;
		}

		

		if (map.get(index) == 0) {
			energy -= 1;
		} else {
			energy -= 3;
		}

		while (index != 0) {

			if (index+k < lc) {

				index += k;

			} else {

				index = (index + k)%lc;

			}

			if (map.get(index) == 0) {
				energy -= 1;
			} else {
				energy -= 3;
			}

		}

		System.out.println(energy);

	}

}
