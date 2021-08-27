package hackerrank;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Zolution {


     public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);

         int lc = scan.nextInt();

         int rc = scan.nextInt();

         Queue<Integer> integerQueue = new LinkedList<Integer>();

         for(int  i = 0 ; i < lc ; i++){
             integerQueue.add(scan.nextInt());
         }

         for(int i = 0 ; i < rc ; i++){

             int data = integerQueue.poll();

             integerQueue.add(data);

         }

         integerQueue.forEach(a -> System.out.print(a+" "));

     }

 }