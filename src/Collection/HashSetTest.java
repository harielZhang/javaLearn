package Collection;

import java.util.HashSet;
import numbers.genCharacter;
import java.util.List;

public class HashSetTest {

//    public static List<String> findSameLetter(HashSet<String> hs){
//
//
//    }

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        String[] ls = new String[100];
        for (int i = 0; i<100; i++){
            String str = genCharacter.genLetter(2);
//            hs.add(str);
            ls[i] = str;
        }
        for (int i = 0; i<ls.length; i++){
            System.out.print(ls[i]+"\t");
            if (i % 20 == 19)
                System.out.println();
        }
        for (String s1 : ls){
            int repeat = 0;
            for (String s2 : ls){
                if (s2.equalsIgnoreCase(s1)){
                    repeat++;
                }
            }
            if (repeat>1)
                hs.add(s1);
        }
        System.out.println("重复的有"+hs);
    }
}
