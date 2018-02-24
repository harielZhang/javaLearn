package file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StringStream {

    public static void main(String[] args) {

        File f2 = new File("src/pig2.txt");
        try(FileWriter fw = new FileWriter(f2)){
            String str = "shepi jiushi shepi";
            char[] cs = str.toCharArray();
            fw.write(cs);
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }

//        File f = new File("src/pig.txt");
//        try (FileReader fr = new FileReader(f)){
//            char [] all = new char[(int)f.length()];
//            fr.read(all);
//            for (char each : all){
//                System.out.println(each);
//            }
//        }catch (IOException e){
//            e.printStackTrace();
//        }

    }
}
