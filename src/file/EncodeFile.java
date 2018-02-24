package file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EncodeFile {

    private static void encodeFile(File originalFile, File encodedFile){
        try(FileReader fr = new FileReader(originalFile)){
            char [] all = new char[(int)originalFile.length()];
            fr.read(all);
            for (int i = 0; i<all.length; i++){
                int bi = (byte)all[i];
                if (bi == 57)
                    all[i] = (char)48;
                if (bi == 90|bi == 122){
                    all[i] = (char)(bi-25);
                }
                if ((bi>47&&bi<57)|(bi>64&&bi<90)|(bi>96&&bi<122)){
                    bi+=1;
                    all[i] = (char)bi;
                }
            }
            try(FileWriter fw = new FileWriter(encodedFile)){
                fw.write(all);

            }catch (IOException e){
                e.printStackTrace();
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void decodeFile(File originalFile, File decodedFile){
        try(FileReader fr = new FileReader(originalFile)){
            char [] cs = new char[(int)originalFile.length()];
            fr.read(cs);
            for (int i = 0; i<cs.length; i++){
                int bi = (byte)cs[i];
                if (bi == 48)
                    cs[i] = (char)57;
                if (bi == 65|bi == 97){
                    cs[i] = (char)(bi+25);
                }
                if ((bi>48&&bi<57)|(bi>65&&bi<90)|(bi>97&&bi<122)){
                    bi-=1;
                    cs[i] = (char)bi;
                }
            }
            FileWriter fw = new FileWriter(decodedFile);
            fw.write(cs);
            fw.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        File fo = new File("src/of.txt");
        File ef = new File("src/ef.txt");
//        encodeFile(fo, ef);
        File df = new File("src/df.txt");
        decodeFile(ef, df);


    }
}
