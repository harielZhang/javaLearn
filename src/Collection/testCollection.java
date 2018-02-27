package Collection;

import character.Hero;

import java.util.ArrayList;

public class testCollection {

    public static void main(String[] args) {
        ArrayList heros = new ArrayList();
        for (int i = 0; i<5; i++){
            heros.add(new Hero(String.valueOf(i), 30));
        }
        Hero spch = new Hero("shepi", 3);
        heros.add(3, spch);
        System.out.println(heros);
        System.out.println(heros.get(5));
        heros.set(4, new Hero("zhupi", 30));
        Hero[] hs = (Hero[])(heros.toArray(new Hero[]{}));
        for (Hero h : hs){
            if (h.getName() == "shepi")
                System.out.println("找到了名为shepi的英雄");
        }

    }
}
