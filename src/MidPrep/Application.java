package MidPrep;

public class Application {
    public static void main(String[] args) {
        Company company = new Company("Microsoft");
        Department dep1 = new Department("HR","SanFrancisco,CA",company);
        Department dep2 = new Department("Sales","Florida, Miami",company);
        //adding department
        company.addDepartment(dep1);
        company.addDepartment(dep2);
        Employee employee = new Employee(1,"Kirubel","S","Mengesha","12-5-1998",1234567890L,12000);

        //adding positions to each department
        Position pos1 = new Position("HR Assitant","assisting HR manager",dep1,employee);
        Position pos2 = new Position("Sales associate","assisting sales Manager",dep2,null);
        Position pos3 = new Position("Manager","managing Day-to-day activities",dep1,null);
        dep1.addPosition(pos1);
        dep1.addPosition(pos1);
        dep1.addPosition(pos1);
        dep2.addPosition(pos2);
        dep2.addPosition(pos2);
        dep2.addPosition(pos2);

        



    }
}
