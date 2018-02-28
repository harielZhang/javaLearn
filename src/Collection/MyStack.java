package Collection;

import character.Hero;

import java.util.LinkedList;

public class MyStack implements Stack {

    private LinkedList<Hero> ll = new LinkedList<>();

    @Override
    public void push(Hero h){
        if (null!=h){
            ll.addLast(h);
        }
    }

    @Override
    public Hero pull() throws  StackOverFlowException{
        if (null==ll) {
            throw new StackOverFlowException("已经挂了呀");
        }
        Hero tmp = ll.getLast();
        ll.removeLast();
        return tmp;
    }
    @Override
    public Hero peek() throws StackOverFlowException{
        if (null==ll){
            throw new StackOverFlowException("没东西了呀");
        }
        return ll.getLast();
    }

    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push(new Hero("shepi"));
        ms.push(new Hero("zhupi"));
        try{
            Hero p = ms.peek();
            System.out.println(p);
        }catch (StackOverFlowException e){
            e.printStackTrace();
        }
        try{
            ms.pull();
            ms.pull();
        }catch (StackOverFlowException e){
            e.printStackTrace();
        }
        try{
            ms.pull();
        }catch (StackOverFlowException e){
            e.printStackTrace();
        }

    }

}

class StackOverFlowException extends Exception{
    public StackOverFlowException(){

    }

    protected StackOverFlowException(String msg){
        super(msg);
    }


}