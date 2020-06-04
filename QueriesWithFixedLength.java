package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class QueriesWithFixedLength {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int lc = scan.nextInt();

        int tc = scan.nextInt();

        ArrayList<Integer> al = new ArrayList<>();

        ArrayList<Integer> q = new ArrayList<>();

        for(int i = 0 ; i < lc ;i++){
            al.add(scan.nextInt());
        }

        for(int i = 0 ; i < tc ;i++){
            q.add(scan.nextInt());
        }


        for(int i = 0 ;i < lc ;i++){
            for(int j = 0; j < lc ; j +=q.get(i)){
                for(int k = j ; k <= j+q.get(i) ; k++) {
                    System.out.print(al.get(k) + " ");
                }
                System.out.println("");
            }
            System.out.println("==========");
        }
    }
}
