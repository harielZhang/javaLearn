package Collection;

import Collection.MyHashCode;

import java.util.LinkedList;
import Collection.Entry;
import java.util.List;

public class MyHashMap implements IHashMap {

    private LinkedList<Entry> [] objs = new LinkedList[2000];
    @Override
    public void put(String key, Object value){
        int index = MyHashCode.hashcode(key);
        LinkedList<Entry> lst = objs[index];
        Entry enty = new Entry(key, value);
        if (null==lst) {
            lst = new LinkedList<>();
        }
        lst.add(enty);


    }

    @Override
    public void get(String key){

    }

    public static void main(String[] args) {
        MyHashMap mhs = new MyHashMap();
        mhs.put("shepi", "zhupi");

    }

}
