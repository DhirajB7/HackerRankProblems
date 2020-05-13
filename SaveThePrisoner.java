package hackerrank;

import java.util.Scanner;

public class SaveThePrisoner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int lc = scan.nextInt();

        for(int i = 0 ; i < lc ;i++){

            int n = scan.nextInt();

            int m = scan.nextInt();

            int s = scan.nextInt();

            System.out.println(((m+s-2)%n)+1);

        }

    }
}
