package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestException {

    public static void method1(){
        try{
            method2();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("扔给我？？");
        }
    }

    private static void method2() throws FileNotFoundException{
        File ff = new File("shepi.txt");
        new FileInputStream(ff);

    }

    public static int method(){
        try{
            return 1;
        }catch (Exception e){
            return 2;
        }finally {
            return 3;
        }
    }

    public static void main(String[] args) {
//        File f = new File("src/pig.txt");
//        try{
//            FileInputStream fis = new FileInputStream(f);
//        }catch (FileNotFoundException e){
//            e.getStackTrace();
//        }finally {
//            System.out.println("我还是被执行了");
//        }
//        method1();
//        System.out.println(method());
        String [] sary = new String[5];
        try{
            for (int i = 0; i < sary.length +1; i++){
                System.out.println(sary[i]);
            }
        }catch (Exception e){
            System.out.println("hh");
            e.printStackTrace();
        }

    }
}
