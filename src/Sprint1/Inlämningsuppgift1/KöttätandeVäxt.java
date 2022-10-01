package Sprint1.Inlämningsuppgift1;

public class KöttätandeVäxt extends Växter implements Iprint {
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
        double proteinDrink = 0.1 + (getHeightInMeters() * 0.2);  // polymorfism ändrar utskriften från Iprint Interfacen
        System.out.println("Köttätande växten " + this.getName() + " ska ha " + proteinDrink + "l proteindrink per dag");
    }
}
