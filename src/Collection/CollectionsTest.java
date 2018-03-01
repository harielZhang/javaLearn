package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class CollectionsTest {

    public static void ShuffleGame(List<Integer> lst){
        int len = (int)1e6;
        int count = 0;
        for (int i = 0; i<len; i++){
            Collections.shuffle(lst);
            if (lst.get(0) == 3 && lst.get(1) == 1 && lst.get(2) == 4) {
//                System.out.println(lst);
                count++;
//                break;
            }
        }
        System.out.println("出现了：");
        System.out.println(count);
//        System.out.println();
        double result = (double)count/(double)len;
        System.out.println("概率为"+result*100+"%");
//        System.out.printf("概率为%d\%", result*100);
    }

    public static void main(String[] args) {

        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i<10; i++){
            ls.add(i);
        }
//        System.out.println(ls);
//        System.out.println("xx后");
//        Collections.reverse(ls);
//        Collections.rotate(ls, 3);
//        Collections.swap(ls, 2, 4);
//        System.out.println(ls);
        ShuffleGame(ls);
    }
}
