package hackerrank;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        long startNumber = scan.nextLong();

        long endNumber = scan.nextLong();

        long k = scan.nextLong();

        scan.close();

        int answer = 0;

        for(long i = startNumber ; i <= endNumber ;i++){
            long reverseNumber = Long.parseLong(new StringBuilder(String.valueOf(i)).reverse().toString());
            long remainder = Math.abs(i-reverseNumber)%k;
            if(remainder==0){
                answer++;
            }
        }

        System.out.println(answer);

    }

}
