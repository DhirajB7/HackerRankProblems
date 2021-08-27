package hackerrank;

import java.util.Scanner;

public class LargestRectangle {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		long lc = scan.nextLong();
		
		long[] h = new long[(int) lc];
		
		for(long i = 0 ; i < lc ; i++) {
			h[(int) i] = scan.nextLong();
		}
		
		long n = h.length;
        long max = 0;
        long[] stack = new long[(int) (n + 1)];
        long is = -1;
        for (long i = 0; i <= n; i++) {
        	long height = (i == n) ? 0 : h[(int) i];
            while (is != -1 && height < h[(int) stack[(int) is]]) {
            	long hh = h[(int) stack[(int) is--]];
            	long width = (is == -1) ? i : i - 1 - stack[(int) is];
                max = Math.max(max, hh * width);
            }
            stack[(int) ++is] = i;
        }
        System.out.println(max);

	}

}
