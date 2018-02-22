package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    // 生成随机日期
    public static Date getRandomDate(int start, int end){
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY");
        try {
            Date starty = sdf.parse(String.valueOf(start));
            Date endy = sdf.parse(String.valueOf(end + 1));
            long stime = starty.getTime();
            long etime = endy.getTime() - 1;
            long rdtime = (long)(stime + Math.random()*(etime - stime));
            return new Date(rdtime);

        }catch (ParseException e){
            e.printStackTrace();
        }
        return null;

    }

    public static String toString(Date dt){
        return dt.toString();
    }

    public static String toString(Date dt, String str){
        SimpleDateFormat sdf = new SimpleDateFormat(str);
        return sdf.format(dt);
    }
    public static void main(String[] args) {

        Date [] dAry = new Date[9];
        for (int i = 0; i<9;i++){
            dAry[i] = getRandomDate(1997, 2000);
        }
        System.out.println("排序前日期如下");
        for (int i = 0; i < dAry.length; i++){
            System.out.println(toString(dAry[i])+"\t");
            if (2==i%3)
                System.out.println();
        }

        //冒泡排序
//        for (int i = 0; i < dAry.length-1; i++){
//            for (int j = 0; j < dAry.length -1; j++){
//                Date temp;
//                String aTime = toString(dAry[j], "HHmmss");
//                String bTime = toString(dAry[j+1], "HHmmss");   //转化时钟时间
//                int at = Integer.parseInt(aTime);
//                int bt = Integer.parseInt(bTime);
//                if (at > bt){
//                    temp = dAry[j];
//                    dAry[j] = dAry[j+1];
//                    dAry[j+1] = temp;
//                }
//            }
//        }
        //选择排序
        for (int i = 0; i < dAry.length-1; i++){
            for (int j = i; j < dAry.length; j++){
                Date temp;
                String aTime = toString(dAry[i], "HHmmss");
                String bTime = toString(dAry[j], "HHmmss");
                int at = Integer.parseInt(aTime);
                int bt = Integer.parseInt(bTime);
                if (at > bt){
                    temp = dAry[i];
                    dAry[i] = dAry[j];
                    dAry[j] = temp;
                }
            }
        }

        System.out.println("排序后日期如下");
        for (int i = 0; i < dAry.length; i++){
            System.out.println(toString(dAry[i])+"\t");
            if (2==i%3)
                System.out.println();
        }

    }

}
