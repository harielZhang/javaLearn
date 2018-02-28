package Collection;

import character.Hero;
import Collection.StackOverFlowException;

public interface Stack {
    public void push(Hero h);
    public Hero pull () throws StackOverFlowException;
    public Hero peek() throws StackOverFlowException;
}
