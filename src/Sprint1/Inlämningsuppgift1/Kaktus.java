package Sprint1.Inlämningsuppgift1;

import javax.swing.*;
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
        JOptionPane.showMessageDialog(null, "Kaktusen " + this.getName()
                + " ska ha 0.2l mineralvatten");
    }
}
