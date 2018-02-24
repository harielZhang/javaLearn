import java.util.Scanner;

public class test{
	public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("输入");
//        String rp = sc.next();
//        String Str = new String("public class @class@ {");
        String Str = "public class @class@ {";
        char [] cs = Str.toCharArray();

        System.out.println(Str.replaceAll("@class@", rp));
	}
}