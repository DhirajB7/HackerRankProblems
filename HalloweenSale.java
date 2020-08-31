package hackerrank;

import java.util.Scanner;

public class HalloweenSale {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int p = scan.nextInt();

        int d = scan.nextInt();

        int m = scan.nextInt();

        int s = scan.nextInt();

        s = s - p;
        p = p - d;

        int answer = 0;
        if(s>=0){
             answer = 1;
        }


        while (s >= m){
            if(p<=m){
                s = s - m;
            }else{
                s = s - p;
                p = p - d ;
            }
            if(s>=0) {
                answer++;
            }
        }

        System.out.println(answer);


    }
}
