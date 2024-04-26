package PaintingMS;

import java.util.ArrayList;
import java.util.List;

public class Painter {
    private String name;
    private int age;
    private double salary;
    List<Painting> paintingList;
    List<Children> childrenList;
    //constructor


    public Painter(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        paintingList =  new ArrayList<>();
        childrenList = new ArrayList<>();
    }

    //getter and setter then

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public double totalCost(){
        double totalCost = 0.0;
        for (Painting p : paintingList){
                totalCost += p.getCost();
        }
        return totalCost;
    }
    public int greatestChildrenAge(){
        int largestAge = Integer.MIN_VALUE; // Initialize max to the smallest possible integer value
        for (Children child : childrenList) {
            if (child.getAge() > largestAge) {
                largestAge = child.getAge();
            }
        }
        return largestAge;

        }
        public void addChild(Children children){
            childrenList.add(children);
    }
       public void removeChild(Children child) {
           if (child != null) {
               childrenList.remove(child);
           }
       }
           public void addPaint (Painting painting){
               paintingList.add(painting);
           }

       }
