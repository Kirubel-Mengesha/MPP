package Lab3_1_2_3;

import java.util.Objects;

public class Employee implements Cloneable{
    private int employeeId;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private String birthDate;
    private long SSN;
    private double salary;
    private Position position;

    public Employee(int employeeId, String firstName, String middleInitial, String lastName, String birthDate, long SSN, double salary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.SSN = SSN;
        this.salary = salary;

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public long getSSN() {
        return SSN;
    }

    public void setSSN(long SSN) {
        this.SSN = SSN;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
    public void print() {
        System.out.println("Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", middleInitial='" + middleInitial + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", SSN=" + SSN +
                ", salary=" + salary +
                ", position=" + position +
                '}');
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", middleInitial='" + middleInitial + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", SSN=" + SSN +
                ", salary=" + salary +
                '}';
    }

    public boolean equals(Object obj){
        if(this == obj){
            return  true;
        }
        if (obj == null  || getClass()!= obj.getClass()){
            return  false;
        }
        Employee e = (Employee) obj;
        return employeeId == e.employeeId &&
                SSN == e.SSN &&
                Double.compare(salary, e.salary)==0 &&
                Objects.equals(firstName, e.firstName)&&
                Objects.equals(lastName, e.lastName) &&
                Objects.equals(middleInitial,e.middleInitial) &&
                Objects.equals(birthDate, e.birthDate);

    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, firstName, middleInitial, lastName, birthDate, SSN, salary);
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        Employee copy = (Employee) super.clone();
        copy.position = (Position) position.clone();
        return copy;
    }



    }

