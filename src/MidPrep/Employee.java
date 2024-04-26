package MidPrep;

public class Employee {
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
        //this.position = position;
    }
    private void print(){
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
}
