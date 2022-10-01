package Sprint1.Inlämningsuppgift1;

public abstract class Växter{
    private String name;
    private double heightInMeters;

    public Växter(String name, double heightInMeters) {
        this.name = name;
        this.heightInMeters = heightInMeters;
    }

    public String getName() {
        return name;
    }

    public double getHeightInMeters() {
        return heightInMeters;
    }

    public abstract void printHowMuchWater();

    public abstract String typeOfFlower();
}
