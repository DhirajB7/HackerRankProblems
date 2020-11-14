package hackerrank;

import java.util.Scanner;

public class TaumAndBday {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int lc = scan.nextInt();

        for(int i = 0 ; i < lc ; i++ ){

            long b = scan.nextInt();

            long w = scan.nextInt();

            long bc = scan.nextInt();

            long wc = scan.nextInt();

            int z = scan.nextInt();
            

            if( wc+z < bc || bc+z < wc){

                if(wc+z < bc){
                    System.out.println((b*(wc+z))+(w*wc));
                }else{
                    System.out.println((b*bc)+(w*(bc+z)));
                }
            }else{
                System.out.println((b*bc)+(w*wc));
            }

        }
        
        scan.close();

    }
}
