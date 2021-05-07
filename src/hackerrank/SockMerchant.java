package hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class SockMerchant {
	
	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int lc = scan.nextInt();

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i = 0 ; i < lc ; i ++){
            int key = scan.nextInt();
            if(hm.get(key)!=null){
                int value = hm.get(key);
                hm.replace(key,value,value+1);
            }else{
               hm.put(key,1);
            }
        }

        scan.close();

     int answer = hm.values().stream().mapToInt(a->a/2).filter(a->a>=1).sum();

        System.out.println(answer);

    }

}
