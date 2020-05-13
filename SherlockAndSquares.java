package hackerrank;

import java.util.Scanner;

public class SherlockAndSquares {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int lc = scan.nextInt();

        for(int i = 0 ; i < lc ; i++){

            int a  = scan.nextInt();

            int b = scan.nextInt();


            System.out.println((int) (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a))+1));

        }

    }
}
