package Animals;

public interface Pet{

    public String getName();    //返回宠物名字

    public void setName(String name);   //为宠物命名

    default void play(){
        System.out.println("宠物与你一起玩耍");
    }

}