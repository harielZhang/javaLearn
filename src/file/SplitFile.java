package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class SplitFile {
    public static void main(String[] args) {
        File fs = new File("/Users/hariel/Downloads/youdaot.jpeg");
        String str = "/Users/hariel/Downloads/youdaot";
        // 分离文件
//        if (fs.exists()){
////            System.out.println(fs.getName());
//            System.out.println(fs.length());
//            byte[] tmpb = new byte[(int)1e3];
//            FileOutputStream fos;
//            try {
//                FileInputStream fis = new FileInputStream(fs);
//                int i = 0;
//                while (fis.read(tmpb)!= -1){
//                    fos = new FileOutputStream(new File(str + i +".jpeg"));
//                    fos.write(tmpb);
//                    i++;
//                }
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//
//        }
        // 合并文件
        File fo = new File(str + "new.jpeg");
        try{
            FileOutputStream fos = new FileOutputStream(fo);
            byte [] tmp = new byte[1024];
            for (int i = 0; i < 5; i++){
                FileInputStream fis = new FileInputStream(str + i + ".jpeg");
                while(fis.read(tmp)!=-1){
                    fos.write(tmp);
                }
                fis.close();
            }
            fos.close();

        }catch (Exception e){
            e.printStackTrace();
        }



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
