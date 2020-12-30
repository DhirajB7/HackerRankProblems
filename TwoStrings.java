package hackerrank;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class TwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int lc = scan.nextInt();
		
		for(int i = 0 ; i < lc ; i++) {
			
			Set<String> one = Arrays.stream(scan.next().split("")).collect(Collectors.toSet());
			Set<String> two = Arrays.stream(scan.next().split("")).collect(Collectors.toSet());
			
			int lenOne = one.size();
			int lenTwo = two.size();
			
			one.addAll(two);
			
			System.out.println((one.size()==lenOne+lenTwo) ? "NO" : "YES" );
			
			
		}
		
		scan.close();

	}

}
