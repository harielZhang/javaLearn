package file;

import java.io.*;
import character.Hero;

public class DataStream {

    private static void dataStream(File of){
        try(
                FileOutputStream fos = new FileOutputStream(of);
                DataOutputStream dos = new DataOutputStream(fos);
                ){
            String str = "15@23";
            dos.writeUTF(str);

        }catch (IOException e){
            e.printStackTrace();
        }
        try(
                FileInputStream fis = new FileInputStream(of);
                DataInputStream dis = new DataInputStream(fis);
                ){
            String str = dis.readUTF();
            String [] sa = str.split("@");
            int i = 1;
            for (String s : sa){
                System.out.println("第"+i+"个数字是"+s);
                i++;
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    private static void ObjectSream(File f){
        Hero [] heroes = new Hero[10];
        for (int i = 0; i<10; i++){
            heroes[i] = new Hero(String.valueOf(i), 300);
        }
        try(
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
                ){
            oos.writeObject(heroes);
            Hero [] hs = (Hero [])ois.readObject();
            for (Hero each : hs){
                System.out.println(each.getName());
            }

        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }



    }

    public static void main(String[] args) {
        File lol = new File("src/testFile/lol.txt");
        ObjectSream(lol);

    }
}
