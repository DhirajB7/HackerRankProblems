package hackerrank;

import java.util.Scanner;
import java.util.TreeMap;

public class UtopianTree {
    static TreeMap<Integer,Integer> map = new TreeMap<>();

    static void getHeight(){
        map.put(0,1);

        for(int i = 1 ; i <= 60;i++){
            if(i%2==1){
                int value = map.get(i-1)*2;
                map.put(i,value);
            }else{
                int value = map.get(i-1)+1;
                map.put(i,value);
            }
        }
    }


    public static void main(String[] args) {


        getHeight();

        Scanner scan = new Scanner(System.in);

        int lc = scan.nextInt();

        for(int i = 0 ; i < lc ; i++){

            int key = scan.nextInt();

            System.out.println(map.get(key));

        }

    }
}
