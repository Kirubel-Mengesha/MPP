package SchoolLab;

public class Course {
    private String number;
    private String title;
    private int units;
    private Faculty faculty;

    public Course(String number, String title, int units,Faculty faculty) {
        this.number = number;
        this.title = title;
        this.units = units;
        this.faculty = faculty;
    }

    public int getUnits() {
        return units;
    }

    public Faculty getFaculty() {
        return faculty;
    }
}
