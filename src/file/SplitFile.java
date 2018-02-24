package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class SplitFile {

    private static void SplitFile(String folder, String fileName){
        File fs = new File(folder, fileName);
        if (fs.exists()){
            System.out.println(fs.getName());
            System.out.println(fs.length());
            byte[] tmpb = new byte[1024];
            FileOutputStream fos;
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(fs);
                int i = 0;
                while (fis.read(tmpb)!= -1){
                    File fo = new File(folder, "youdaot"+i+".jpeg");
                    System.out.println(fo.getName());
                    fos = new FileOutputStream(fo);
                    fos.write(tmpb);
                    i++;
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                try{
                    if (null!=fis)
                        fis.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }

    }

    private static void union(String folder, String fileName){
        File fu = new File(folder, fileName);
        try(FileOutputStream fos = new FileOutputStream(fu)){
            int index = 0;
            while (true){
                File eachfile = new File(folder, "youdaot" + index + ".jpeg");
                index++;
                if (!eachfile.exists())
                    break;
                try (FileInputStream fis = new FileInputStream(eachfile)){
                    byte [] tmp = new byte[(int)eachfile.length()];
                    fis.read(tmp);
                    fos.write(tmp);
                    fos.flush();
                }
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        String fs = "/Users/hariel/Downloads/";
        String str = "youdaot.jpeg";
//        SplitFile(fs, str);
        union(fs, "new.jpeg");
         //分离文件

        // 合并文件
//        File fo = new File(str + "new.jpeg");
//        try{
//            FileOutputStream fos = new FileOutputStream(fo);
//            byte [] tmp = new byte[1024];
//            for (int i = 0; i < 5; i++){
//                FileInputStream fis = new FileInputStream(str + i + ".jpeg");
//                while(fis.read(tmp)!=-1){
//                    fos.write(tmp);
//                }
//                fis.close();
//            }
//            fos.close();
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }



//        byte[] uni;
//        int sum = 0;
//        for (int i = 0; i < 5; i++) {
//            File tmpf = new File(str + i +".jpeg");
//            sum += (int)tmpf.length();
//        }
//        uni = new byte[sum+1000];
//        System.out.println(uni.length);
//        int des = 0;
//        for (int i = 0; i < 5; i++) {
//            File tmpf = new File(str + i +".jpeg");
//            des += (int)tmpf.length();
//
//            try{
//                FileInputStream fis = new FileInputStream(tmpf);
//                byte [] tmpb = new byte[(int)tmpf.length()];
//                fis.read(tmpb);
//                System.arraycopy(tmpb, 0, uni, des, (int)tmpf.length());
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//        }
//
//        try{
//            FileOutputStream fos = new FileOutputStream(new File(str + "new.jpeg"));
//            fos.write(uni);
//            fos.close();
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }

    }
}
