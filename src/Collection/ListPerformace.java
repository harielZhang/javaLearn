package Collection;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListPerformace {

    private static void insertFirst(List<Integer> l, String type){
        int total = 1000*100;
        final int number = 5;
        long start = System.currentTimeMillis();
        for (int i = 0; i<total; i++){
            l.add(0, number);
        }
        long end = System.currentTimeMillis();
        System.out.printf("使用 %s 方法 插入头，耗时%d ms", type, end-start);
        System.out.println();

    }

    private static void insertLast(List<Integer> l, String type){
        int total = 1000*100;
        final int number = 5;
        long start = System.currentTimeMillis();
        for (int i = 0; i<total; i++){
            l.add(number);
        }
        long end = System.currentTimeMillis();
        System.out.printf("使用 %s 方法 插入尾部，耗时%d ms", type, end-start);
        System.out.println();
    }

    private static void insertMid(List<Integer> l, String type){
        int total = 1000*100;
        final int number = 5;
        long start = System.currentTimeMillis();
        for (int i = 0; i<total; i++){
            l.add(i/2, number);
        }
        long end = System.currentTimeMillis();
        System.out.printf("使用 %s 方法 插入尾部，耗时%d ms", type, end-start);
        System.out.println();
    }


    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        List<Integer> ll = new LinkedList<>();
        insertMid(al, "arraylist");
        insertMid(ll, "linkedlist");

    }
}
