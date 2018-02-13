package property;

import java.util.Arrays;


public class Controltest {
    public static void main(String[] args) {
    int [] [] a = new int[5][8];
    for (int i = 0; i<5; i++){
        for (int j = 0; j<8; j++){
            a[i][j] = (int)(Math.random()*100);
        }
    }
for (int i = 0; i<5; i++){
        for (int j = 0; j<5; j++){
            System.out.println(a[i][j]);
        }
}

    int [] temp = new int[8];
    for (int i =0; i<5; i++){
        System.arraycopy(a[i], 0, temp, 0, 8);
        Arrays.sort(temp);
        System.arraycopy(temp, 0, a[i], 0, 8);
        }
        System.out.println("---------------");
        for (int i = 0; i<5; i++){
            for (int j = 0; j<5; j++){
                System.out.println(a[i][j]);
            }
        }
    }
}