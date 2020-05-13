package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CutTheSticks {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int len = scan.nextInt();

        List<Integer> al = new ArrayList<>();

        for(int i = 0 ; i < len;i++){
            al.add(scan.nextInt());
        }

        while(al.size()>0){
            System.out.println(al.size());
            int minValue = al.stream().mapToInt(a->a).min().getAsInt();
            al = al.stream().map(a->a-minValue).filter(a->a>0).collect(Collectors.toList());
        }

    }

}
