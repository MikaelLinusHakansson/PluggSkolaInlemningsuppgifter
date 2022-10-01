package Sprint1.Inlämningsuppgift1;

public class KöttätandeVäxt extends Växter{
    public KöttätandeVäxt(String name, double heightInMeters) {
        super(name, heightInMeters);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getHeightInMeters() {
        return super.getHeightInMeters();
    }

    @Override
    public void printHowMuchWater() {
        double proteinDrink = 0.1 + (getHeightInMeters() * 0.2);
        System.out.println(this.getName() +" ska ha " + proteinDrink + " proteindrink per dag");
    }

    @Override
    public String typeOfFlower() {
        String type = getClass().getSimpleName();
        return type;
    }
}
