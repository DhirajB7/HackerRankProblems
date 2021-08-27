package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class SirviceLane {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberOfIp = scan.nextInt();

        int numberOfTc = scan.nextInt();

        ArrayList<Integer> al = new ArrayList<>();

        for( int i = 0 ; i < numberOfIp ; i++){
            al.add(scan.nextInt());
        }

        for(int i = 0 ; i < numberOfTc ; i++){

           int start = scan.nextInt();

           int end = scan.nextInt();

           System.out.println(al.subList(start,end+1).stream().mapToInt(a->a).min().getAsInt());

        }


        scan.close();
    }
}
