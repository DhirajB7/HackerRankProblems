package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GreedyFlorist {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        long numberOfFlowers = scan.nextLong();

        long numberOfFriends = scan.nextLong();
        
        scan.close();

        ArrayList<Long> al = new ArrayList<>();

        for(long i = 0 ; i < numberOfFlowers ;i++){
            al.add(scan.nextLong());
        }

        Collections.sort(al);

        long answer = 0;

        long x = 1;

        for(long i = numberOfFlowers; i > 0; x++){
            for(long k = 0; i>0 && k < numberOfFriends; k++){
                answer += x*al.get((int) --i);
            }
        }
        System.out.println(answer);


    }
}
