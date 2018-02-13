package character;

public interface AP{
    //魔法攻击
    public void magicAttack();

    default public void Attack(){
        System.out.println("使用了AP攻击");
    }


}