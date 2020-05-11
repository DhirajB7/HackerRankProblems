package hackerrank;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class TheHurdleRace {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int lc = scan.nextInt();

        int maxJump = scan.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0 ; i < lc ;i++){
            pq.add(scan.nextInt());
        }

        int maxJumpInDs = pq.poll();

        System.out.println((maxJumpInDs > maxJump) ? maxJumpInDs-maxJump : 0);

    }
}
