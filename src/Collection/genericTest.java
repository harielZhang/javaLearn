package Collection;

import character.Hero;
import property.LifePotion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class genericTest {

    public static void main(String[] args) {
        List<Hero> hl = new ArrayList<>();
        for (int i = 0 ; i<100; i++){
            hl.add(new Hero(String.valueOf(i+1), 30));
        }
//        System.out.println(hl.get(6).getName());
        System.out.println(hl);
        for (int i =0; i<hl.size(); i++){
            if (Integer.parseInt(hl.get(i).getName()) % 8 ==0)
                hl.remove(i);
        }
        System.out.println(hl);
    }
}

