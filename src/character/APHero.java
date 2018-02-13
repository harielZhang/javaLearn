package character;

public class APHero extends Hero implements AP, Mortal{

    @Override
    public void magicAttack(){
        System.out.println("进行了魔法攻击");
    }

    @Override
    public void die(){
        System.out.println("AP英雄被杀了！");
    }

    public static void HeroBattleWin(){
        System.out.println("AP Hero battle win");
    }
}