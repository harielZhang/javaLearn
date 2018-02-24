package file;

import java.io.*;
import java.nio.charset.Charset;

public class CnStream {

    public static void readChinese(File f){
        System.out.println("默认编码方式:" + Charset.defaultCharset());
        // 使用默认方法读取字节流
        try(FileReader fr = new FileReader(f)){
            char[] cs = new char[(int)f.length()];
            fr.read(cs);
            System.out.println(new String(cs));
        }catch (IOException e){
            e.printStackTrace();
        }

        // 使用inputsreamreader来读取字节流
        try(InputStreamReader isr = new InputStreamReader(new FileInputStream(f), Charset.forName("GBk"))){
            char [] cn = new char[(int)f.length()];
            isr.read(cn);
            System.out.println(new String(cn));

        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void showCode(String str){
        String[] encodes = { "BIG5", "GBK", "GB2312", "UTF-8", "UTF-16", "UTF-32" };
        for (String encode : encodes){
            showCode(str, encode);
        }
    }

    private static void showCode(String str, String encode){
        try {
            System.out.printf("字符: \"%s\" 在编码 %s 的十六进制是", str, encode);
            byte[] bs = str.getBytes(encode);
            for (byte b : bs){
                int i = b&0xff;
                System.out.print(Integer.toHexString(i) + "\t");
            }
            System.out.println();
            System.out.println();

        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String [] sa = {"E5", "B1", "8C"};
        byte [] bs = new byte[3];
        try {
            int i = 0;
            for (String s : sa) {
                bs[i] = (byte)Integer.parseInt(s, 16);
                i++;
            }
            String st = new String(bs, "utf-8");
            System.out.println(st);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
