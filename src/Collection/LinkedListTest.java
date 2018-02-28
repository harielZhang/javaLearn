package Collection;

import java.util.LinkedList;
import character.Hero;
import java.util.Queue;

public class LinkedListTest  {

    public static void main(String[] args) {
        Queue<Hero> q = new LinkedList<>();
        q.offer(new Hero("shepi"));
        q.offer(new Hero("zhupi"));
        System.out.println(q);
        Hero h = q.peek();
        System.out.println(h);

    }
}
