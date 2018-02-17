package Date;

import java.util.Date;

public class TestDate {

    public static double genRdtime(){
        double rd = Math.random()*10;
        while(rd > 3.1507199)
        {
            rd = Math.random()*10;
        }
        return rd;

    }

    public static void main(String[] args) {
//        Date d1 = new Date();
//        System.out.println("当前时间" + d1);
//
//        System.out.println(d1.toString());
//        System.out.println(d1.getTime());

        Date d1 = new Date(0);
        System.out.println("1997年第一天" + d1);
        long t2 = (long)3.1507199e10;
        System.out.println(t2);
        Date d2 = new Date(t2);
        System.out.println("1997年最后一天" + d2);
//        System.out.println(genRdtime());
        int rdt = (int)(genRdtime()*1e10);
        System.out.println(rdt);
        Date rd3 = new Date(rdt);
        System.out.println("1997随机一天是" + rd3);




    }
}
