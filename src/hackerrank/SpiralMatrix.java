package hackerrank;

import java.util.Scanner;

public class SpiralMatrix {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();

        int n = scan.nextInt();

        int[][] arr = new int[m][n];

        //create matrix

        for(int i = 0 ; i< m ;i++){
            for(int  j = 0 ; j < n ; j ++){
                arr[i][j] = scan.nextInt();
            }
        }

        scan.close();

        //displaymatrix

        for(int i = 0 ; i< m ;i++){
            for(int  j = 0 ; j < n ; j ++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }

        //perform operation


        int startColIndex = 0;
        int endColIndex = n-1;
        int startRowIndex = 0 ;
        int endRowIndex = m-1;

        int count = m*n;

        while (count >= 1) {
            for (int i = startColIndex; i <= endColIndex; i++) {
                System.out.print(arr[startRowIndex][i] + " ");
                count--;
            }
            startRowIndex++;

            for (int i = startRowIndex; i <= endRowIndex; i++) {
                System.out.print(arr[i][endColIndex] + " ");
                count--;
            }
            endColIndex--;

            for (int i = endColIndex; i >= startColIndex; i--) {
                System.out.print(arr[endRowIndex][i] + " ");
                count--;
            }
            endRowIndex--;

            for (int i = endRowIndex; i >= startRowIndex; i--) {
                System.out.print(arr[i][startColIndex] + " ");
                count--;
            }
            startColIndex++;

        }
    }

}
