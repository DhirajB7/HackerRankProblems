package hackerrank;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class MOdifiedFibbo {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<BigInteger> al = new ArrayList<BigInteger>();
		
		String a = scan.next(); //t1
		
		String b = scan.next(); //t2
		
		long n = scan.nextLong();
		
		al.add(new BigInteger(a));
		al.add(new BigInteger(b));
		
		int count = 1;
		
		while(n-2>0) {
			al.add( al.get(count-1).add(al.get(count).multiply(al.get(count))));
			count++;
			n--;
		}
		
		System.out.println(al.get(al.size()-1));
		scan.close();
	}
	
	

}
