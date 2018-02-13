package first;

public class SomeString{

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("laozitianxiadiyi");
        sb.delete(2,5);
        System.out.println(sb.toString());
    }
}