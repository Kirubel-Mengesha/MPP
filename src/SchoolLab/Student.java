package SchoolLab;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private double GPA;
    List<Course> courseList;
    public Student(String name, String phone, int age, double salary, double GPA){
        super(name,phone,age,salary);
        this.GPA = GPA;
        courseList = new ArrayList<>();
    }
    public void addCourse(Course course){
        courseList.add(course);
    }
    public int getTotalUnits(){
//        int totalUnits = 0;
//        if (!courseList.isEmpty()) {
//            for (Course c : courseList) {
//                totalUnits += c.getUnits();
//            }
//        }
//        return totalUnits;
        int total = courseList.stream().filter(a->a!=null)
                .map(a->a.getUnits())
                .reduce(0,(a,b)->a+b);
        return total;
    }

}
