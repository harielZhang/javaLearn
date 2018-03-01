package Collection;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class NonRepeatRanint {

    private static String genRandint(int len){

//        List<Integer> ls = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i<len; i++){
            sb.append(((int)(Math.random()*10)));
        }
//        System.out.println(sb);
        return sb.toString();
    }

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        genRandint(4);
        int sum = 0;
        while(hs.size() < 50){
            hs.add(genRandint(4));
            sum++;
        }
        System.out.println(hs);
        System.out.println(sum);
        System.out.println(hs.size());

    }
}
