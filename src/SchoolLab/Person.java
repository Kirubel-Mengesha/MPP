package SchoolLab;

public class Person {
    private String name;
    private String phone;
    private int age;
    private double salary;

    public Person(String name, String phone, int age,double salary) {
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        //return 0;
        return salary;
    }

}

