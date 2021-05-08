package hackerrank;

import java.util.Scanner;
import java.util.TreeMap;

public class JavaAnagrams {

	static boolean isAnagram(String a, String b) {

		TreeMap<String, Integer> mapA = new TreeMap<String, Integer>();
		TreeMap<String, Integer> mapB = new TreeMap<String, Integer>();

		for (int i = 0; i < a.length(); i++) {

			String key = String.valueOf(a.charAt(i)).toLowerCase();

			if (mapA.containsKey(key)) {
				mapA.put(key, mapA.get(key) + 1);
			} else {
				mapA.put(key, 1);
			}

		}

		for (int i = 0; i < b.length(); i++) {

			String key = String.valueOf(b.charAt(i)).toLowerCase();

			if (mapB.containsKey(key)) {
				mapB.put(key, mapB.get(key) + 1);
			} else {
				mapB.put(key, 1);
			}

		}
		
		return mapA.equals(mapB);

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}