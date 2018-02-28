package Collection;

import java.util.ArrayList;
import java.util.List;

public class Tnode {
    public Tnode leftT;
    public Tnode rightT;
    public Object val;

    public void add(Object v){
        if (null==val)
            val = v;
        else {
            if ((Integer)v - (Integer)val < 0){
                if (null == leftT)
                    leftT = new Tnode();
                leftT.add(v);
            }
            else {
                if (null == rightT)
                    rightT = new Tnode();
                rightT.add(v);
            }
        }
    }

    public List<Object> values(){
        List<Object> values = new ArrayList<>();
        if (null!=leftT)
            values.addAll(leftT.values());

        values.add(val);

        if (null!=rightT)
            values.addAll(rightT.values());

        return values;
    }

    public static void main(String[] args) {
        int[] randoms = new int[]{67, 7, 30, 73, 10, 0, 78, 81, 10, 74 };
        Tnode roots = new Tnode();
        for (int number: randoms){
            roots.add(number);
        }
        System.out.println(roots.values());
    }

}
