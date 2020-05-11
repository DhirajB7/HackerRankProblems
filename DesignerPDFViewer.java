package hackerrank;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class DesignerPDFViewer {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] nums = scan.nextLine().split(" ");

        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();

        int count = 0;

        for(char i = 'a' ; i<= 'z' ; i++){

            map.put(String.valueOf(i),Integer.valueOf(nums[count]));
            count++;

        }

        String input = scan.nextLine();
        int len = input.length();
        int max = 0;
        for(String a : input.split("")){
            if(map.get(a) > max){
                max = map.get(a);
            }
        }

        System.out.println(max*len);

    }
}
