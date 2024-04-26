package PaintingMS;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create some children
        Children child1 = new Children("Alice", 14);
        Children child2 = new Children("Bob", 22);
        Children child3 = new Children("Bob", 8);
        Children child4 = new Children("Bob", 25);
        Children child5 = new Children("Bob", 66);
        Children child6 = new Children("Bob", 44);

        // Create a painter
        List<Painting> paintings = new ArrayList<>();
        List<Children> childrenList = new ArrayList<>();
        Painter painter1 = new Painter("John", 40, 50000);
        Painter painter2 = new Painter("Kai",20,10000);

        // Add some children to the painter
        painter1.addChild(child1);
        painter1.addChild(child2);
        painter2.addChild(child3);
        painter2.addChild(child4);
        painter1.addChild(child5);
        painter2.addChild(child6);

        // Add some paintings to the painter
        Painting painting1 = new Painting("Landscape", 1001.287,1200,painter1);
        Painting painting2 = new Painting("Portrait", 1500.7844,1400,painter2);
        painter1.addPaint(painting1);
        painter2.addPaint(painting2);

        // Calculate total cost
//        double totalCost = painter.totalCost();
//        System.out.printf("Total cost of paintings: $" +"%,.2f", totalCost);

         //Find the greatest age among children
        int greatestAge = painter1.greatestChildrenAge();
        System.out.println("Greatest age among children: " + greatestAge);
//
        Department dep = new Department("HR");
        dep.addPainting(painting1);
        //dep.addPainting(painting2);
        //dep.printOutPainterInfo();
    }
}
