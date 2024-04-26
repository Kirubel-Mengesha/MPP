package SchoolLab;

import LambdaAndStream.Employee;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    List<Person> personList;
    public Department(String name){
        this.name = name;
        personList = new ArrayList<>();
    }
    public void addperson(Person person){
        personList.add(person);
    }

    //using polymorphism
    public double getTotalSalary(){
//        double totalSalary = 0.0;
//        for (Person p: personList){
//            if (p.getSalary() != 0){
//                totalSalary += p.getSalary();
//            }
//
//        }
//        return totalSalary;
       return (double) personList.stream().mapToDouble(Person::getSalary).reduce(0,(x,y)->x+y);

    }
    public double getTotalSalaryUsingInstanceof(){
//        double totalSalary = 0.0;
//        for (Person p: personList){
//            if (p instanceof Faculty){
//                totalSalary += ((Faculty )p).getSalary();
//            }
//            if (p instanceof Staff){
//                totalSalary += ((Staff)p).getSalary();
//            }
//        }
//        return totalSalary;
        return (double)  personList.stream()
                .filter(p -> p instanceof Faculty || p instanceof Staff)
                .mapToDouble(p -> {
                    if (p instanceof Faculty) {
                        return ((Faculty) p).getSalary();
                    } else {
                        return ((Staff) p).getSalary();
                    }
                })
                .reduce(0.0, (a, b) -> a + b);



    }

    public void showAllMembers(){
//        for (Person p: personList){
//            String temp= "";
//            if (p instanceof Faculty){
//                temp = "Faculty";
//            } else if (p instanceof Student) {
//                temp = "Student";
//            }
//            else {
//                temp = "Staff";
//            }
//            System.out.println("name " + p.getName()+ " phone " + p.getPhone()+ " age " + p.getAge()+ " type " + temp);
//        }

        personList.stream().forEach(a -> {
            String temp = a instanceof Faculty ? "Faculty" : (a instanceof Student ? "Student" : "Staff");
            System.out.println("name: " + a.getName() + " phone: " + a.getPhone() + " age: " + a.getAge() + " type: " + temp);

        });
    }
    public void unitsPerFacultyUsingInstanceof(){
//        for (Person p:personList){
//            if (p instanceof Faculty){
//                Faculty faculty = (Faculty) p;
//                System.out.println(faculty.getName() + " " + faculty.getTotalUnits());
//            }
//        }
        personList.stream().filter(a->a instanceof Faculty)
                .map(a->(Faculty) a)
                .forEach(a-> System.out.println(a.getName() + " " + a.getTotalUnits()));
    }
    //using getClass().getSimpleName()
    public void unitsPerFaculty(){
//        for (Person p: personList){
//            if (p.getClass().getSimpleName().equals("Faculty")){
//                Faculty faculty = (Faculty) p;
//                System.out.println(faculty.getName() +" "+ faculty.getTotalUnits());
//            }
//        }
        personList.stream().filter(a->a.getClass().getSimpleName().equals("Faculty"))
                .map(a->(Faculty) a)
                .forEach(a-> System.out.println(a.getName() + " " + a.getTotalUnits()));

    }

}
