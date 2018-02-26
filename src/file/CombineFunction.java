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

    public static void copyFolder(String orifolder, String destfolder){
        File f = new File(orifolder);
        String[] filePath = f.list();
        if (!(new File(destfolder).exists()))
            (new File(destfolder)).mkdirs();

        for (int i = 0; i<filePath.length; i++){
            if ((new File((orifolder + f.separator +filePath[i]))).isDirectory()){
                copyFolder(orifolder + f.separator + filePath[i], destfolder + f.separator + filePath[i]);
            }

            if (new File(orifolder + f.separator + filePath[i]).isFile()){
                copyFile(new File(orifolder + f.separator + filePath[i]), new File(destfolder + f.separator + filePath[i]));
            }
        }

    }



    public static void main(String[] args) {
        String s1 = "src/testFile";
        String s2 = "src/ppFile";
        copyFolder(s1, s2);
    }
}
