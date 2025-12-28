public class BankAccount {
    int currentBalance;
    public BankAccount(){
        this.currentBalance = 1000;
    }
    public boolean sufficientFundsExist(int amount){
        return amount < currentBalance;
    }

    public void withDraw(int amount) throws InsufficientFundsException{
            if(!sufficientFundsExist(amount)){
                throw new InsufficientFundsException("Not Enough money to withdraw",500);
            }
            currentBalance -= amount;
            System.out.println(amount+" is withdrawn successfully!!!!");
    }
    public static void main(String[] args)  {
        try{
            BankAccount account = new BankAccount();
            account.withDraw(50);
            account.withDraw(2500);
        }
        catch (InsufficientFundsException obj){
            System.out.println(obj.getMessage());
            System.out.println(obj.getErrorCode());
        }
    }
}
