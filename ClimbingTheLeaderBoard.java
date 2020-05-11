package hackerrank;

import java.util.*;

public class ClimbingTheLeaderBoard {

    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);

        long lc = scan.nextLong();

        LinkedHashMap<Long,Long> lhm = new LinkedHashMap<>();
        TreeSet<Long> ts = new TreeSet<>(Collections.reverseOrder());

        long rank = 1;

        for(long l = 0 ; l < lc ; l++){
            long key = scan.nextLong();
            if(lhm.get(key)==null) {
                lhm.put(key,rank);
                rank++;
            }
        }

        ts.addAll(lhm.keySet());

        long aLc = scan.nextLong();

        ArrayList<Long> al = new ArrayList<>();

        for(long i = 0 ; i < aLc ; i++){
            al.add(scan.nextLong());
        }

        for(Long num : al){
            if(ts.contains(num)){
                System.out.println(lhm.get(num));
            }else{
                if(ts.higher(num)!=null){
                   // System.out.println(num+" "+ts.higher(num));
                    System.out.println(lhm.get(ts.higher(num)));
                }else{
                    System.out.println(lhm.size()+1);
                }
            }
        }


    }
}
