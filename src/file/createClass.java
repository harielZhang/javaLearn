package file;

import java.io.*;
import java.util.Scanner;

public class createClass {

    public static void main(String[] args) {
        File f = new File("src/testFile/autoClass.txt");
        File f1 = new File("src/testFile/instClass.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入类名");
        String cls = sc.next();
        System.out.println("请输入属性类型");
        String ptype = sc.next();
        System.out.println("请输入属性名");
        String pname = sc.next();
        try(
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fos = new FileWriter(f1);
                BufferedWriter bw = new BufferedWriter(fos);
                ){
            System.out.println("开始转化...");
            while(true){
                String line = br.readLine();
                if (null==line)
                    break;
                line.replaceAll("@class@", cls);
                line.replaceAll("@type@", ptype);
                line.replaceAll("@property@", pname);
                System.out.println(line);
//                bw.write(line);
            }
            System.out.println("转化完毕");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
