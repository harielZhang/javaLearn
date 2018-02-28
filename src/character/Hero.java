package character;

import Collection.LOL;
import property.Item;
import java.io.Serializable;

public class Hero implements Serializable, LOL{

    private static final long serialVersionUID = 1L;
    String name;
    int hp;
    float armor;
    int movespeed = 300;

    static String copyright;

    public Hero(){

    }

    public Hero(String name){
        this.name = name;
    }

    public Hero(String name, int hp){
        this.name = name;
        this.hp = hp;
//        System.out.println("你就这样调用我");

    }

    public Hero(String name, int hp, float heroArmor, int heroMovespeed){
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

    public int getHp(){
        return hp;
    }

    void recovery(float blood){
        hp += blood;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.name;
    }



    public static void main(String[] args) {

//        Hero garren = new Hero("盖伦", 0);
//        ADHero vn = new ADHero("薇恩", 500);
//        try {
//            vn.attack(garren);
//        }catch (EnemyHeroIsDead e){
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//        Item i = new Item();

//        vn.useItem(i);
//        APHero xf = new APHero();

//        APHero h = new APHero();
//        h.HeroBattleWin();



    }


}







