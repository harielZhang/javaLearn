package character;

public class Support extends Hero implements Healer, Mortal{

    @Override
    public void healer(){
        System.out.println("进行了治疗");
    }

    @Override
    public void die(){
        System.out.println("辅助英雄被杀了！");
    }
}