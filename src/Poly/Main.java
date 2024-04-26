package Poly;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[5];
        shape[0] = new Rectangle("red",3.1,2.6);
        shape[1]= new Rectangle("blue",4.3,4.2);
        shape[2] = new Circle("green",5.5);
        shape[3] = new Square(2.1,"pink");
        shape[4] = new Circle("black",1.2);
        printTotal(shape);
    }
    public static void printTotal(Shape[] shape){
        double totalArea = 0.0;
        double totalPerimeter = 0.0;
        for (Shape s:shape){
            totalArea += s.calculateArea();
            totalPerimeter += s.calculatePerimeter();
        }
        System.out.println("Area: " + totalArea);
        System.out.println("perimeter: " + totalPerimeter);
    }
}
