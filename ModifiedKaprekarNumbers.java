package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class ModifiedKaprekarNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Long> answers = new ArrayList<>();

        long start = scan.nextLong();

        long end = scan.nextLong();

        if(start==1L){
            answers.add(1L);
        }

        for(long a = start ; a <= end; a++){
            long r = String.valueOf(a).length();
            long sqNum = a*a;
            String sqNumString = String.valueOf(sqNum);
            long l = sqNumString.length()-r;
            long right = 0;
            if(r>=1 && l>=1) {
                 long left = Long.parseLong(sqNumString.substring(0, (int) l));
                 right = Long.parseLong(sqNumString.substring((int)l));
                if(a == left+right){
                    answers.add(a);
                }
            }

        }

        if(answers.size()==0){
            System.out.println("INVALID RANGE");
        }else{
            answers.forEach(a-> System.out.print(a+" "));
        }

    }
}
