package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import character.Hero;


public class HashMapTest {
    public static void main(String[] args) {
        List<Hero> hs = new ArrayList<>();
        System.out.println("初始化开始...");
        for (int i = 0; i<3e6; i++){
            Hero h = new Hero("hero-" + random());
            hs.add(h);
        }
        HashMap<String, List<Hero>> heroMap = new HashMap<>();
        for (Hero h : hs){
            List<Hero> list = heroMap.get(h.getName());
            if (list == null){
                list = new ArrayList<>();
                heroMap.put(h.getName(), list);
            }
            list.add(h);
        }
        System.out.println("初始化结束");
        System.out.println("开始查找");
        String name = "hero-5555";
        findByList(hs, name);
        findByMap(heroMap, name);

    }

    public static List<Hero> findByMap(HashMap<String, List<Hero>> m, String name){
        long start = System.currentTimeMillis();
        List<Hero> result = m.get(name);
        long end = System.currentTimeMillis();
        System.out.printf("用map方法共找到%d个英雄，耗时%d", result.size(), end-start);

        return result;
    }

    public static List<Hero> findByList(List<Hero> hs, String name){
        long start = System.currentTimeMillis();
        List<Hero> result = new ArrayList<>();
        for (Hero h : hs){
            if (h.getName().equals(name))
                result.add(h);
        }
        long end = System.currentTimeMillis();
        System.out.printf("用list方法共找到%d个英雄，耗时%d", result.size(), end-start);

        return result;
    }

    public static int random(){
        return ((int)(Math.random()*9000)+1000);
    }


}
