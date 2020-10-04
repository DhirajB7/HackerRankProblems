package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class SequenceEquation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int lc = scan.nextInt();
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i = 0 ; i < lc ; i++) {
			al.add(scan.nextInt());
		}
		
		scan.close();
		
		for(int i = 1 ; i <= lc ;i ++) {
			
			System.out.println(al.indexOf(al.indexOf(i)+1)+1);
			
		}

	}

}
