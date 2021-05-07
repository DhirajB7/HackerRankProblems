package hackerrank;

import java.util.Scanner;

/**
 * Zolution
 */
public class Zolution {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

	System.out.println("ENTER NAME HERE");

    String name = scan.nextLine();

    System.out.println("Hello " + name);

    scan.close();
  }
}
