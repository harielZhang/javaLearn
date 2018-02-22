package Exception;

public class Account {
    private double balance;

    public double getBalance(){
        return this.balance;
    }

    public void deposit(double money){
        this.balance += money;
    }

    public void withdraw(double money) throws OverdraftException{
        if (balance<money) {
            double def = money - this.balance;
            throw new OverdraftException(def, "余额不足");
        }
        this.balance -= money;
    }

    public static void main(String[] args) {
        Account zs = new Account();
        zs.deposit(500);
        System.out.println(zs.getBalance());
        try{
            zs.withdraw(600);
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println(zs.getBalance());
//        zs.getBalance();
    }

}

