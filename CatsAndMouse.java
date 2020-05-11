package hackerrank;

import java.util.Scanner;

public class CatsAndMouse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int testCase = scan.nextInt();

        for(int i = 0 ; i < testCase ; i++) {

            int catAPos = scan.nextInt();

            int catBPos = scan.nextInt();

            int mousePos = scan.nextInt();

            int aToM = Math.abs(catAPos - mousePos);

            int bToM = Math.abs(catBPos - mousePos);

            if (aToM > bToM) {
                System.out.println("Cat B");
            } else if (bToM > aToM) {
                System.out.println("Cat A");
            } else {
                System.out.println("Mouse C");
            }
        }


    }

}
