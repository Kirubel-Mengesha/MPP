package GreetingCard;

public abstract class CardPackage {
    private String name;
    private boolean isDiscounted;

    public CardPackage(String name, boolean isDiscounted) {
        this.name = name;
        this.isDiscounted = isDiscounted;
    }

    public boolean isDiscounted() {
        return isDiscounted;
    }

    public String getName() {
        return name;
    }
}
