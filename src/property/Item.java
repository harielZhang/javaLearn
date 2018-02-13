package property;

public abstract class Item{
    String name;
    int price;

    public void buy(){
        System.out.println("购买消耗" + price);
    }
//
    public void effect(){
        System.out.println(name + "物品被使用， 有效果");
    }

    public abstract void disposal();



//
//    public boolean equals(Object o){
//        if (o instanceof Item){
//            Item i = (Item) o;
//            if (this.price == i.price)
//                return true;
//        }
//        return false;
//    }
//
//    public String toString(){
//        return name+price;
//    }

    public static void main(String[] args) {
//        Item it = new Item();
//        it.name = "血瓶";
//        it.price = 150;
        Item lp = new Item(){
            public void disposal(){
                System.out.println("使用后消失");
            }
        };
        lp.disposal();

    }
}

//class Armor extends Item{
//    int ac;
//}

