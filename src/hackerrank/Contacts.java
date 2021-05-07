package hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class Contacts {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lc = scan.nextInt();
        scan.nextLine();

        HashMap<String,Integer> map = new HashMap<>();

        for(int i = 0 ; i < lc ; i++){

            String[] data = scan.nextLine().split(" ");

            if(data[0].equalsIgnoreCase("add")){
                String ip = data[1];
                for(int j = 1;j <= ip.length();j++){
                    String key = ip.substring(0,j);
                    int value  = 1;
                    if(map.get(key)!=null){
                        value = map.get(key)+1;
                    }
                    map.put(key,value);
                }

            }else{

                if(map.get(data[1])==null){
                    System.out.println(0);
                }else{
                    System.out.println(map.get(data[1]));
                }
            }

        }

        scan.close();
    }
}
