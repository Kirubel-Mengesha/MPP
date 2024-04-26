package Lab3_1_2_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Department {
    private String name;
    private String location;
    List<Position> positions;
    private Company company;//reference to Company class


    public Department(String name, String location, Company company) {
        this.name = name;
        this.location = location;
        this.company = company;
        positions = new ArrayList<>();
    }
    public void addPosition(Position position) {
        positions.add(position);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Company getCompany() {
        return company;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void print(){
        System.out.println("\tDepartment: " + name);
        System.out.println("\tLocation: " + location);
        System.out.println("\tPositions:");
//        for (Position position : positions) {
//            position.print();
//        }
        positions.forEach(Position::print);
    }

    public double getSalary() {
//        double total = 0.0;
//        for (Position p : positions) {
//            if (p.getEmployee() != null) {
//                Employee employee = p.getEmployee();
//                total += employee.getSalary();
//            }
//        }
//        return total;
        return (double) positions.stream().filter(a->a.getEmployee()!= null)
                .map(Position::getEmployee)
                .mapToDouble(Employee::getSalary)
                .reduce(0,(a,b)->a+b);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Department d = (Department) obj;
        return Objects.equals(name, d.name)&&
                Objects.equals(location, d.location) &&
                Objects.equals(positions, d.positions) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, positions);
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", positions=" + positions +
                '}';
    }
}
