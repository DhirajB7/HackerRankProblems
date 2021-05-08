package hackerrank;

import java.util.Scanner;
import java.util.TreeSet;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
       
        
        TreeSet<String> dict = new TreeSet<String>();
        
        for (int i = 0; i <= s.length()-k; i++) {
			dict.add(s.substring(i,i+k));
		}
        
        return dict.first()+"\n"+dict.last();
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}