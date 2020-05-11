package hackerrank;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PickingNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int lc = scan.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0 ; i < lc;i++){
            pq.add(scan.nextInt());
        }

        scan.close();

        int count = 0;
        int answer = 0;
        int firstValue = pq.peek();
        for(int i = 0 ; i < lc ; i++){
            int a = pq.poll();
            if(a-firstValue<=1){
                count++;
                answer = Math.max(answer,count);
            }else{
                firstValue = a;
                answer = Math.max(answer,count);
                count=1;
            }

        }

        System.out.println(answer);

    }
}
