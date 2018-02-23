package file;

import java.io.File;
import java.util.Date;

public class TestFile {

    public static File[] allIn(File f){
        File [] ft = new File[2];
        if (f.length() != 0){
            File [] fs = f.listFiles();
            File mitmp = fs[0];
            File matmp = fs[0];
        for (File each : fs){
            if (each.length() == 0)
                continue;
            if (each.isDirectory()) {
                System.out.println(each.getName());
                ft = allIn(each);
                if (ft[0].length() > matmp.length())
                    matmp = ft[0];
                if (ft[1].length() < mitmp.length())
                    mitmp = ft[1];
                continue;
            }
            if (mitmp.length() > each.length())
                mitmp = each;
            if (matmp.length() < each.length())
                matmp = each;
        }
        File [] fr = new File[2];
        fr[0] = matmp;
        fr[1] = mitmp;
        return fr;
        }
        return null;

    }

    public static void main(String[] args) {
        File f = new File("/Users/hariel/Downloads");
        File[] fr = allIn(f);
        System.out.println("最大的文件是" + fr[0].getName() + " 其长度为" +fr[0] .length());
        System.out.println("最小的文件是" + fr[1].getName() + " 其长度为" + fr[1].length());
    }
}
