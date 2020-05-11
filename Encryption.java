package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Encryption {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String data = scan.nextLine().replaceAll("[ ]*","");


        int length = data.length();

        int row = (int) Math.floor(Math.sqrt(length));

        int col = (int) Math.ceil(Math.sqrt(length));

        if(row*col<length){
            if(row<col){
                row = col;
            }else{
                col = row;
            }
        }

        if(row*col>length) {
            data = data + " ".repeat((row * col) - length);
        }

        String[][] dataMatrix = new String[row][col];

        int count = 0;

        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ;j++){
                dataMatrix[i][j] = data.split("")[count];
                count++;
            }
        }
        for(int i = 0 ; i < col ; i++){
            for(int j = 0 ; j < row ;j++){
                System.out.print(dataMatrix[j][i].trim());
            }
            System.out.print(" ");
        }

    }
}
