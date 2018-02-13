package Animals;

public class Cat extends Animal implements Pet{

    protected String name;

    public Cat(String name){
        super(4);
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println(this.name + "猫正在吃东西");
    }

}