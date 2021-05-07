package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class BonAppetit {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int lc = scan.nextInt();
		int index = scan.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 0 ; i < lc ; i ++) {
			al.add(scan.nextInt());
		}
		int actual = scan.nextInt();

		scan.close();

		al.remove(index);
		int calculated = (al.stream().mapToInt(a->a).sum())/2;
		if(actual==calculated) {
			System.out.println("Bon Appetit");
		}else {
			System.out.println(actual-calculated);
		}
	}

}
