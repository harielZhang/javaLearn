package Date;

import java.util.Date;
import java.util.Random;

public class TestDate {

    public static double genRdtime(){
        double rd = Math.random()*10;
        while(rd > 3.1507199)
        {
            rd = Math.random()*10;
        }
        return rd;

    }

//    public static void genRd(){
//        Random rd = new Random();
//        double db = rd.nextDouble(0.31507199);
//        System.out.println(db);
//    }

    public static void main(String[] args) {

        Date d1 = new Date(0);
        System.out.println("1997年第一天" + d1);
        long t2 = (long)3.1507199e10;
        System.out.println(t2);
        Date d2 = new Date(t2);
        System.out.println("1997年最后一天" + d2);
//        System.out.println(genRdtime());
        long rdt = (long)(genRdtime()*1e10);
        System.out.println(rdt);
        Date rd3 = new Date(rdt);
        System.out.println("1997随机一天是" + rd3);





    }
}
