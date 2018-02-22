package Exception;

public class OverdraftException extends Exception {
    private double deficit;

    public OverdraftException(){

    }

    public OverdraftException(double def, String msg){
        super(msg + "差"+def+"元");
    }
}
