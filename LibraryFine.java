package hackerrank;

import java.util.Scanner;

public class LibraryFine {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int actualDate = scan.nextInt();

        int actualMonth = scan.nextInt();

        int actualYear = scan.nextInt();

        int expectedDate = scan.nextInt();

        int expectedMonth = scan.nextInt();

        int expectedYear = scan.nextInt();
        
        scan.close();

        int cost = 0;

        if(expectedYear < actualYear ||  (expectedYear == actualYear && expectedMonth < actualMonth) ||  (expectedYear == actualYear && expectedMonth == actualMonth && expectedDate < actualDate)){

            if(expectedYear < actualYear){
                cost = 10000 ;
            }else if(expectedMonth < actualMonth){
                cost = 500 * (expectedMonth - actualMonth) ;
            }else{
                cost = 15 * (expectedDate - actualDate);
            }

        }

        System.out.println(Math.abs(cost));

    }
}
