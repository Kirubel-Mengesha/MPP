package BankAccount;

public class CheckingAccount extends Account{
    private double balance;
    private double monthlyFee;
    private String acctId;

    public CheckingAccount(String acctId, double monthlyFee, double startBalance) {
        this.balance = startBalance;
        this.monthlyFee = monthlyFee;
        this.acctId = acctId;
    }

    public String getAccountID(){
        return acctId;
    }
    public double getBalance(){
        return balance;
    }
    public double computeUpdatedBalance(){
        return balance - monthlyFee;
    }
}
