package PaintingMS;

public class Painting {
    private String title;
    private double cost;
    private double weight;
    private Painter painter;

    public Painting(String title, double cost, double weight, Painter painter) {
        this.title = title;
        this.cost = cost;
        this.weight = weight;
        this.painter = painter;
    }

    public double getCost() {
        return cost;
    }

    public Painter getPainter() {
        return painter;
    }
}
