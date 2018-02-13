package character;


public class ADHero extends Hero implements AD, Mortal{
    int movespeed = 450;
    public void attack(){
        System.out.println(name + "进行了一次攻击，但是不知道打了谁");
    }

    public void attack(Hero... heroes){
        for (int i = 0; i < heroes.length; i++){
            System.out.println(name + "攻击了" + heroes[i].name);
        }
    }

    public ADHero(){
    }

    public ADHero(String name, float hp){
        super(name, hp);
        System.out.println("显式AD英雄被创建了");
    }

    public int getMovespeed1(){
        return this.movespeed;
    }

    public int getMovespeed2(){
        return super.movespeed;
    }

    public void useItem(property.Item i){
        System.out.println("AD英雄"+this.name+"使用了道具");
        super.useItem(i);
    }
    @Override
    public void physicAttack(){
        System.out.println("进行了物理攻击");
    }

    @Override
    public void die(){
        System.out.println("AD英雄被杀了！");
    }

}