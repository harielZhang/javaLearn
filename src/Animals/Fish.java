package Animals;

public class Fish extends Animal implements Pet {
    private String name;

    public void walk(){
        System.out.println("鱼不能走，只能游");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void eat(){
        System.out.println(this.name + "鱼在吃东西");
    }

    public Fish(){
        super(0);
    }

}
