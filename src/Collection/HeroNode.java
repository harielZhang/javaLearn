package Collection;

import character.Hero;

import java.util.ArrayList;
import java.util.List;

public class HeroNode {
    public HeroNode leftNode;
    public HeroNode rightNode;

    public Hero he;

    public void add(Hero h){
      if (null == he) {
          he = h;
      }else {
          if (h.getHp() > he.getHp()){
              if (null==leftNode)
                  leftNode = new HeroNode();
              leftNode.add(h);
          }else {
              if (null==rightNode)
                  rightNode = new HeroNode();
              rightNode.add(h);
          }
      }


    }

    public List<Object> values(){
        List<Object> values = new ArrayList<>();
        if (null!=leftNode)
            values.addAll(leftNode.values());
        values.add(he);
        if (null!=rightNode)
            values.addAll(rightNode.values());
        return values;

    }

    public static void main(String[] args) {
//        Hero[] hl = new Hero[10];
        HeroNode hn = new HeroNode();
        for (int i =0; i<10; i++){
            Hero tmph = new Hero("shepi"+i, (int)(Math.random()*100));
            System.out.println("[name:"+tmph.getName()+"    hp:" + tmph.getHp() +"]");
            hn.add(tmph);
        }
        System.out.println(hn.values());
    }

}
