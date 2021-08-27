package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String data = scan.nextLine();

        BigInteger bigInteger = new BigInteger(data);

        System.out.println(bigInteger.isProbablePrime(1) ? "prime" : "not prime");


    }

}
