package Collection;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> dict = new HashMap<>();
        dict.put("shepi", "蛇皮一下");
        dict.put("zhupi", "猪皮英雄");
        dict.put("t", "坦克英雄");

        System.out.println(dict.get("t"));
    }


}
