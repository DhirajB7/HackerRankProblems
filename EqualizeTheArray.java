package hackerrank;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class EqualizeTheArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		TreeMap<Integer, Integer> tMap = new TreeMap<Integer, Integer>();
		TreeMap<Integer, Integer> answerMap = new TreeMap<Integer, Integer>();

		int lc = scan.nextInt();

		for (int i = 0; i < lc; i++) {

			int key = scan.nextInt();

			int value = 1;

			if (tMap.containsKey(key)) {
				value = tMap.get(key) + 1;
			}

			tMap.put(key, value);
		}

		scan.close();

		for (Entry<Integer, Integer> a : tMap.entrySet()) {

			int value = a.getKey();

			int key = a.getValue();

			answerMap.put(key, value);

		}

		System.out.println(lc - answerMap.lastKey());

	}

}
