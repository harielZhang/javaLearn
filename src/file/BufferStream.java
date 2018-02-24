package file;

import java.io.*;

public class BufferStream {

    private static void readBuffer(File f){
        try(
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
        ){
            while(true){
                String line = br.readLine();
                if (null==line)
                    break;
                System.out.println(line);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void writeBuffer(File f){
        String[] shepi = {"aaaa", "你说神马","我听不到"};
        try(
                FileWriter fw = new FileWriter(f);
//                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(fw);
                ){
            for (String each : shepi){
                pw.print(each);
                pw.flush();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void removeComment(File origf, File destf){
        try(
                FileReader fr = new FileReader(origf);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter(destf);
                BufferedWriter bw = new BufferedWriter(fw);
                ){

            while(true){
                String line = br.readLine();
                if (null==line)
                    break;
                if (line.startsWith("//"))
                    continue;
                bw.write(line + "\n");
                System.out.println(line);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
//        File f = new File("src/shepi.txt");
//        File f2 = new File("src/shepi2.txt");
        File origf = new File("src/testFile/removeComment.txt");
        File destf = new File("src/testFile/newCode.txt");
        removeComment(origf, destf);


    }
}
