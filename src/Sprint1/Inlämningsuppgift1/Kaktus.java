package Sprint1.Inlämningsuppgift1;

import javax.swing.*;

public class Kaktus extends Växter implements Iprint {  // polymorfism, Kaktus är en växt men även en kaktus.

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

/*
Samma som föregående, arv från växter och implemnterat ett interface Iprint.
Överskrivit några metoder som getName, getHeight och printHowMuchWater från interfacen.
*/