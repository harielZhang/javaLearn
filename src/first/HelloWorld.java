package first;

import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入身高");
        float h = s.nextFloat();
        if (h>3){
            h/=100;
        }
        System.out.println("请输入体重");
        float w = s.nextFloat();

        float bmi = w/(h*h);
        System.out.println("您的BMI是" + bmi);
        String re;
        if (bmi < 18.5){
            re = "体重过轻";
        }else if (bmi < 24){
            re = "正常范围";
        }else if (bmi < 27){
            re = "体重过重";
        }else if (bmi < 30){
            re = "轻度肥胖";
        }else if (bmi < 35){
            re = "中度肥胖";
        }else{
            re = "重度肥胖";
        }
        System.out.println("您的身体状态是" + re);




    }
}