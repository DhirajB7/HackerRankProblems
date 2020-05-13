package hackerrank;

import java.util.PriorityQueue;
import java.util.Scanner;

public class QHeap1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int lc = scan.nextInt();

        scan.nextLine();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0 ; i < lc ;i++){
            String input = scan.nextLine().trim();
            if(input.contains(" ")){
                int key = Integer.parseInt(input.split(" ")[0]);
                int value = Integer.parseInt(input.split(" ")[1]);
                if(key==1){
                   pq.add(value);
                }else{
                    pq.remove(value);
                }
            }else{
                System.out.println(pq.peek());
            }
        }

    }
}
