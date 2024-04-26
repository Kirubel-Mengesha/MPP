package MidPrep;

import java.util.ArrayList;
import java.util.List;

public class Position {
    private String title;
    private String description;
    private Department department;
    private Employee employee;

    public Position(String title, String description, Department department, Employee employee) {
        this.title = title;
        this.description = description;
        this.employee = employee;
        this.department = department;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public void print(){
        if (employee!=null){
            System.out.println("title: " + title);
            System.out.println("description" + description);
            System.out.println("position filled by:" );
           // employee.print();
        }
        else {
            System.out.println("position is vacant");
        }
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
