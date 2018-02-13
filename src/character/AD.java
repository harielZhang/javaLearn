package character;


public interface AD{
    //物理伤害
    public void physicAttack();

    default public void attack(){
        System.out.println("使用了AD攻击");
    }
}