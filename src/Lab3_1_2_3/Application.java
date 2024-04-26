package Lab3_1_2_3;

public class Application {
    public static void main(String[] args) {
        Company company = new Company("MIU PLC");
        //create two department objects

        Department Eng = new Department("Engineering","Eng Bldg",company);
        Department hr = new Department("HR","Branch Office",company);
        // Add positions to departments

        Eng.addPosition(new Position("Manager", "Oversees engineering operations", Eng));
        Eng.addPosition(new Position("Developer", "Develops software applications", Eng));
        Eng.addPosition(new Position("Tester", "Tests software applications", Eng));

        hr.addPosition(new Position("HR Manager", "Manages HR operations", hr));
        hr.addPosition(new Position("Recruiter", "Recruits new employees", hr));
        hr.addPosition(new Position("Trainer", "Provides training to employees", hr));

        // Assign employees to some positions
        Employee johnDoe = new Employee(1, "John", "D", "Doe", "1990-01-01", 123456789L, 50000.0);
        Eng.getPositions().get(0).setEmployee(johnDoe);
        Employee janeSmith = new Employee(2, "Jane", "M", "Smith", "1992-05-15", 987654321L, 60000.0);
        Eng.getPositions().get(1).setEmployee(janeSmith);
        Employee aliceJohnson = new Employee(3, "Alice", "K", "Johnson", "1985-10-20", 567890123L, 55000.0);
        hr.getPositions().get(2).setEmployee(aliceJohnson);

        // Add departments to the company
        company.addDepartment(Eng);
        company.addDepartment(hr);

//         Print company hierarchy
        company.print();
        System.out.printf("Total Salary: $" + "%,.2f",company.getSalary());


        //uncomment the following to check Lab7
//        Employee e2 = new Employee(1,"kira","S","solo","12-05-1998",123456789,10000);
//        System.out.println(e1.equals(e2));

//        Position p2 = new Position("manager","supervising day-to-day",Eng);
//        System.out.println(p1.equals(p2));
//       Department d1 = new Department("Cs","sriLanka",company);
//       Department d2 = new Department("cs","sriLanka",company);
//        System.out.println(d1.equals(d2));
//        System.out.println(e1);
//        System.out.println(p1);
//        System.out.println(d1);
//        System.out.println(e1.hashCode());
//        System.out.println(e2.hashCode());
//        try {
//            Employee e1 = new Employee(1, "kira", "S", "solo", "12-05-1998", 123456789, 10000);
//            Position p1 = new Position("manager", "supervising day-to-day", hr);
//            e1.setPosition(p1);
//            Employee cloned = (Employee) e1.clone();
//            System.out.println("original e1: ");
//            e1.print();
//            System.out.println("cloned: ");
//            cloned.print();
//            System.out.println("Are original and cloned positions equal? " + e1.equals(cloned));
//        }
//        catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }








    }
}
