package Collection;

import numbers.genCharacter;

public class MyHashCode {

    public static int hashcode(String str){
        int len = str.length();
        if (len == 0)
            return 0;
        char[] tempa = str.toCharArray();
        int tempResult = 0;
        for (int i = 0; i<len; i++){
            tempResult += (byte)tempa[i];
        }
        tempResult *= 23;
        if (tempResult < 0)
            tempResult = -tempResult;
        if (tempResult > 2000)
            tempResult %= 2000;
        return tempResult;
    }

    public static void main(String[] args) {
//        for (int i = 0; i< 100; i++){
//            String st = genCharacter.genLetter((int)(Math.random()*10));
//            System.out.println(st);
//            System.out.println(hashcode(st));
//        }
//        System.out.println(hashcode("EE96"));

    }
}
