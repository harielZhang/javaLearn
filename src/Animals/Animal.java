package Animals;

public abstract class Animal{
    protected int legs;

    protected Animal(int legs){
        this.legs = legs;
    }

    public abstract void eat();

    public void walk(){
        System.out.println("此动物用"+this.legs+"条腿走路");
    }

    public void playwith(Animal ani){
        System.out.println(this.legs + "条腿的动物正在和" + ani.legs +"条腿的动物玩耍");
    }

    public static void main(String[] args) {
        Cat kitty = new Cat("kitty");
//        kitty.play();
//        kitty.eat();
//        kitty.walk();
        Fish uri = new Fish();
        uri.walk();
        uri.setName("uri");
        uri.eat();
        uri.play();
        kitty.playwith(uri);

    }
}