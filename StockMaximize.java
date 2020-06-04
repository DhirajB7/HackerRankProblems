package hackerrank;

import java.util.Scanner;

public class StockMaximize {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int testCase = scan.nextInt();

        for(int i = 0 ; i < testCase ;i++){

            int arrSize = scan.nextInt();
            long[] ipArrray = new long[arrSize];

            for(int j = 0 ; j< arrSize ;j++){
                ipArrray[j] = scan.nextLong();
            }

            long answer = 0;

            long max = ipArrray[arrSize-1]; //edge case cover + -ve test case

            for(int j = arrSize-2 ; j >= 0 ; j--){  //reverse iteration, Y ...negative test case
                if(max > ipArrray[j]){
                    answer += max - ipArrray[j];
                }else{
                    max = ipArrray[j];
                }
            }

            System.out.println(answer);
        }

        scan.close();

    }
}
