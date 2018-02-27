package property;

import Collection.LOL;

public class LifePotion extends Item implements LOL{

    public LifePotion(String name){
        super.name = name;
    }

    public void effect(){
        System.out.println("血瓶使用后，可以有回复效果");
    }

    public void disposal(){
        System.out.println("donothing");
    }
}