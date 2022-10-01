package Sprint1.Inlämningsuppgift1;

public class Palm extends Växter implements Iprint {
    public Palm(String name, double heightInMeters) {
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
    public void printHowMuchWater() {  // polymorfism ändrar utskriften från Iprint Interfacen
        double amountOfWater = 0.5 * getHeightInMeters();
        System.out.println("Palmen " + this.getName() + " ska ha " + amountOfWater + "l vatten om dagen!");
    }


}
