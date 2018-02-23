package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;

public class testStream {
    public static void main(String[] args) {
//        File fo = new File("src/shepi.txt");
        File fi = new File("src/pig.txt");
        Scanner sc = new Scanner(System.in);
        String str = "src/zhenjinga/shepi.txt"; // 输入相对路径
        String[] stra = str.split("/");     //截取相对路径
        StringBuffer sb = new StringBuffer();       //创建文件路径和文件
        for (int i = 0; i< stra.length-1; i++){
            sb.append(stra[i] + "/");
        }
        File ml = new File(sb.toString());
        File fl = new File(str);
        if (!ml.exists())
            ml.mkdirs();
        try{
        if (!fl.exists())
            fl.createNewFile();}
            catch (Exception e){
            e.printStackTrace();
            }


//        File fe = new File(str);
//        try{
//            FileInputStream fiss = new FileInputStream(fi);
//            byte[] ri = new byte[(int)(fi.length())];
//            fiss.read(ri);
//            fiss.close();
//            if (!fe.exists()) {
//                System.out.println("文件不存在！");
//                fe.mkdirs();
//                fe.createNewFile();
//            }
//            FileOutputStream foss = new FileOutputStream(fe);
//            foss.write(ri);
//            foss.close();
//        }catch (Exception e){
//            e.printStackTrace();
//        }


//        try{
//            FileInputStream fis = new FileInputStream(fi);
//            byte[] all = new byte[(int)(fi.length())];
//            fis.read(all);
//            for (byte b : all){
//                System.out.println(b);
//            }
//            fis.close();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        try{
//            FileOutputStream fos = new FileOutputStream(fo);
//            String [] sta = {"she", "pi"};
//            byte [] ba = {87, 88};
//            fos.write(ba);
//            fos.close();
//
//        }catch(Exception e){
//            e.printStackTrace();
//        }
    }
}
