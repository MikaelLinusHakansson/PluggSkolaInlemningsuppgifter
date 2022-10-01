package Sprint1.Inlämningsuppgift1;

import java.util.ArrayList;
import java.util.List;

public class Kaktus extends Växter implements Iprint {

    public Kaktus(String name, double heightInMeters) {
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
        System.out.println("Kaktusen " + this.getName() + " ska ha 0.2l vatten per dag");
    }
}
