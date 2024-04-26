package SchoolLab;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person{
    List<Course> courseList;
    public Faculty(String name, String phone, int age, double salary){
        super( name,phone,age,salary);
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
        int totals = courseList.stream().filter(a-> a != null)
                .map(Course::getUnits)
                .reduce(0,(a,b)->a+b);
        return totals;
    }


    //overrride getSalary()
}
