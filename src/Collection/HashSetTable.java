package Collection;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class HashSetTable {

    public static void main(String[] args) {
//        HashMap<String, String> hm = new HashMap<>();
//        hm.put("adc", "物理英雄");
//        hm.put("apc", "魔法英雄");
//        hm.put("t", "坦克英雄");
//        System.out.println(hm);
//        for(String key : hm.keySet()){
////            String temp = key;
//            hm.put(hm.get(key), key);
//        }
//        System.out.println(hm);
        String pi = String.valueOf(Math.PI);
        char[] cp = pi.toCharArray();
        LinkedHashSet<Object> lks = new LinkedHashSet<>();
        for (char s : cp){
            if (s=='.')
                continue;
            lks.add(s);
        }
        System.out.println(lks);
        System.out.println(pi);

    }
}
