package FinalPrep;

public class Country {
    private String name;
    private String continent;
    private int population;
    private double area_In_Square_Miles;

    public Country(String name, String continent, int population, double area_In_Square_Miles) {
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.area_In_Square_Miles = area_In_Square_Miles;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public int getPopulation() {
        return population;
    }

    public double getArea_In_Square_Miles() {
        return area_In_Square_Miles;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-15s %12d %12.2f",
                getName(), getContinent(), getPopulation(), getArea_In_Square_Miles());
    }
}
