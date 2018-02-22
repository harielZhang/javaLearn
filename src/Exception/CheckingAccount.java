package Exception;

public class CheckingAccount extends Account {
    private double overdraftProtection;

    public  void checkAccount(){
//        System.out.printf("您账户余额为%d, 可透支额度为%d", 200.0, overdraftProtection);
        System.out.println("您的账户余额为" + this.getBalance() + " 可透支额度为"+ overdraftProtection);
    }

    public void setOverDraft(double draft){
        this.overdraftProtection = draft;
    }

    public void withdraw(double money)throws OverdraftException{
        double dif = this.getBalance() + overdraftProtection - money;
        if (dif<0){
            throw new OverdraftException(dif, "您的额度已经不足");
        }else if (money < this.getBalance()){
            super.withdraw(money);
        }else if (money > this.getBalance()){
            overdraftProtection -= (money-this.getBalance());
            super.withdraw(this.getBalance());
        }
    }

    public static void main(String[] args) {
        CheckingAccount ck = new CheckingAccount();
        ck.deposit(500);
        ck.setOverDraft(1000);
        ck.checkAccount();
        try{
            ck.withdraw(1600);
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            ck.checkAccount();
        }
    }
}
