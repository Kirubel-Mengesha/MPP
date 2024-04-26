package Lab3_1_2_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Company {
    private String name;
    List<Department> departments;

    public Company(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void print() {
        System.out.println("Company: " + name);
        System.out.println("Departments:");
//        for (Department department : departments) {
//            department.print();
//        }
        departments.forEach(Department::print);

    }

    public double getSalary() {
//        double total = 0.0;
//        for (Department d : departments) {
//            total += d.getSalary();
//        }
//        return total;
        return (double) departments.stream().mapToDouble(Department::getSalary).reduce(0,(a, b)->a+b);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                '}';
    }

}
