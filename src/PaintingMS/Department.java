package PaintingMS;

import java.util.ArrayList;
import java.util.List;

public class Department {
    public String name;
    List<Painting> paintingList;


    public Department(String name) {
        this.name = name;
        paintingList = new ArrayList<>();
    }
    public void printOutPainterInfo(){
        for (Painting p : paintingList) {
            Painter painter = p.getPainter();
            if (painter != null) {
                System.out.println("Name: " + painter.getName() + ", Age: " + painter.getAge() + ", Salary: $" + painter.getSalary());
            }
        }
    }
    public void addPainting(Painting painting){
        paintingList.add(painting);
    }


}
