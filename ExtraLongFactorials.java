package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        BigInteger answer = new BigInteger("1");

        for(int i = 2 ; i <=input;i++){
            answer = answer.multiply(new BigInteger(String.valueOf(i)));
        }

        System.out.println(answer);

    }
}
