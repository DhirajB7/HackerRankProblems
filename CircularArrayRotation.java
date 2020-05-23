package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class CircularArrayRotation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int len = scan.nextInt();

        int numberOFRotations = scan.nextInt();

        int tc = scan.nextInt();

        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0 ; i < len ; i++){
            al.add(scan.nextInt());
        }

        if(numberOFRotations>len){
            numberOFRotations = numberOFRotations%len;
        }

        for(int i = 0 ; i< numberOFRotations;i++){
            int last = al.get(al.size()-1);
            al.remove(al.size()-1);
            al.add(0,last);
        }

        for(int i = 0 ; i < tc ;i++){
            int index = scan.nextInt();
            System.out.println(al.get(index));
        }
    }
}
