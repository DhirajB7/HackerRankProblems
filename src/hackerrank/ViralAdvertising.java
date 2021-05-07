package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class ViralAdvertising {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> al = new ArrayList<>();

        int input = scan.nextInt();
        
        scan.close();

        al.add(2);

        for(int i = 1 ; i < input ;i++){
            int nextValue = (al.get(i-1)*3)/2;
            al.add(nextValue);
        }

        System.out.println(al.stream().mapToInt(a->a).sum());

    }

}
