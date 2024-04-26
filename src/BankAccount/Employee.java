package BankAccount;



import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    List<Account> accountList;

    public Employee(String name) {
        this.name = name;
        accountList = new ArrayList<>();
    }
    public void addAccount(Account account){
        accountList.add(account);
    }

    public String getName() {
        return name;
    }
    public double computeUpdatedBalanceSum(){
        double updatedSum = 0.0;
        for (Account acc : accountList){
            updatedSum += acc.computeUpdatedBalance();
        }
        return updatedSum;
    }


}
