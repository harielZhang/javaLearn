package character;

import property.Item;

public class Hero{
    String name;
    float hp;
    float armor;
    int movespeed = 300;

    static String copyright;

    public Hero(){
        System.out.println("爸爸方法");

    }

    public Hero(String name, float hp){
        this.name = name;
        this.hp = hp;
        System.out.println("你就这样调用我");

    }

    public Hero(String name, float hp, float heroArmor, int heroMovespeed){
        this(name, hp);
        armor = heroArmor;
        movespeed = heroMovespeed;
    }

    public void kill(Mortal m){
        System.out.println(name + "出手了");
        m.die();
    }

    public static void HeroBattleWin(){
        System.out.println("Hero battle win!");
    }

    public void useItem(property.Item i){
        System.out.println(this.name + "使用了道具");
    }

    float getArmor(){
        return armor;
    }

    void keng(){
        System.out.println("坑队友咯");
    }

    void legendary(){
        System.out.println(name + "已经超神啦");
    }

    float getHp(){
        return hp;
    }

    void recovery(float blood){
        hp += blood;
    }

    public static void main(String[] args) {

        Hero garren = new Hero("盖伦", 0);
        ADHero vn = new ADHero("薇恩", 500);
        try {
            vn.attack(garren);
        }catch (EnemyHeroIsDead e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
//        Item i = new Item();

//        vn.useItem(i);
//        APHero xf = new APHero();

//        APHero h = new APHero();
//        h.HeroBattleWin();



    }


}







