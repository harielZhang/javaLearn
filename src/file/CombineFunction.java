package file;

import java.io.*;

public class CombineFunction {

    // 拷贝文件
    public static void copyFile(File orif, File destf){
        try(
                FileInputStream fis = new FileInputStream(orif);
//                BufferedReader br = new BufferedReader(fr);
                FileOutputStream fos = new FileOutputStream(destf);
//                BufferedWriter bw = new BufferedWriter(fw);
                ){
            byte[] tmp = new byte[(int)orif.length()];
            fis.read(tmp);
            fos.write(tmp);

        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void copyFolder(String orifolder){
        File f = new File(orifolder);
        for (File each : f.listFiles()){
            if (each.isDirectory())

            System.out.println(each.getName());
        }

    }

    private static File detectFiles(File f){
        int level=0;
        for (File each : f.listFiles()) {
            if (f.isDirectory()) {
                detectFiles(f);
                level++;

            }
        }

    }

    public static void main(String[] args) {
        String s1 = "src/testFile";
        copyFolder(s1);
    }
}
