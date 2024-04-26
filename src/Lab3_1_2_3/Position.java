package Lab3_1_2_3;

import java.util.Objects;

public class Position implements Cloneable{
    private String title;
    private String description;
    private Department department; //reference to Department class
    public Employee employee;

    public Position(String title, String description, Department department) {
        this.title = title;
        this.description = description;
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    public void assignEmployee(Employee employee){
        this.employee = employee;
    }
    public void unassignEmployee(){
        this.employee = null;
    }

    public void print(){
        System.out.println("\t\tPosition: " + title);
        System.out.println("\t\tDescription: " + description);
        if (employee != null) {
            System.out.println("\t\t\tFilled by:");
            employee.print();
        } else {
            System.out.println("\t\t\tPosition is vacant");
        }

    }
    public double getSalary(){
        if (employee != null){
            return employee.getSalary();
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
       if (this == obj){
           return true;
       }
       if (obj == null || getClass() != obj.getClass()){
           return false;
       }
       Position p = (Position) obj;
       return Objects.equals(title, p.title) &&
               Objects.equals(description, p.description) &&
               Objects.equals(employee, p.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, employee);
    }


    @Override
    public String toString() {
        return "Position{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", employee=" + employee +
                '}';
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        Position copy = (Position) super.clone();
        if (employee != null) {
            copy.employee = (Employee) employee.clone();
        }
        return copy;
    }
}
