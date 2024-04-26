package Equals;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Employee {
    String name;
    double salary;
    Date dob;
    BankAccount b1;
    List<BankAccount> accounts;
    @Override
    public boolean equals(Object obj){
        if (this == obj){return true;}
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Employee employee = (Employee) obj;
        return Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name) &&
                Objects.equals(dob, employee.dob) && Objects.equals(accounts, employee.b1) &&
                Objects.equals(accounts, employee.accounts);
    }


}
