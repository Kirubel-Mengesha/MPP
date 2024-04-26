package MidPrep;

import MidPrep.Department;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    List<Department> departmentList;
    public Company(String name){
        this.name = name;
        departmentList = new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public void print(){
        for (Department d: departmentList){
            System.out.println("name "+ d.getName()+ "location " + d.getLocation());
        }
    }
    public void addDepartment(Department department){
        departmentList.add(department);
    }
}
