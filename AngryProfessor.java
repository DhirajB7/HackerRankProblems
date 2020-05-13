package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class AngryProfessor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int testCase = scan.nextInt();

        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0 ; i < testCase ; i++){
            int numberOfStudents = scan.nextInt();
            int classThreshold = scan.nextInt();
            for(int j = 0 ; j < numberOfStudents ;j++){
                al.add(scan.nextInt());
            }
            System.out.println((al.stream().filter(a->a<=0).count()>=classThreshold) ? "NO" : "YES");
            al.clear();
        }

        scan.close();

    }
}
