package character;

import character.HeroType;
import java.util.Scanner;

public class HeroPlay {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = s.next();
        HeroType hp = HeroType.TANK;

        switch (hp){
            case TANK:
                System.out.println("您选择了坦克");
            case ASSASSIN:
                System.out.println("您选择了刺客");
        }
    }
}