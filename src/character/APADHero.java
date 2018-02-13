package character;

public class APADHero extends Hero implements AP, AD{
    @Override
    public void magicAttack(){
        System.out.println("ap攻击嘛");
    }

    @Override
    public void physicAttack(){
        System.out.println("AD攻击嘛");
    }

    @Override
    public void attack(){
        System.out.println("施展了混合攻击！");
    }


    public static void main(String[] args) {
        APADHero wqds = new APADHero();
        wqds.attack();
    }


}