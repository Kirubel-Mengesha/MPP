package BankAccount;

import java.util.List;

public class Admin {
    public static double computeUpdatedBalanceSum(List<Employee> list){
        //implement
        double updatedSum = 0.0;
        for (Employee e: list){
            updatedSum += e.computeUpdatedBalanceSum();
        }
        return  updatedSum;
    }

}
