package Sprint1.Inlämningsuppgift1;

import javax.swing.*;

public class Kaktus extends Växter implements Iprint {  // polymorfism, Kaktus är en växt men även en kaktus.
    public enum Växt{KAKTUS, KÖTTÄTANDE, PALM}
    private Växt växt = Växt.KAKTUS;
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
        JOptionPane.showMessageDialog(null, getVäxt() + " " + this.getName()
                + " ska ha 0.2l mineralvatten");
    }

    public Växt getVäxt() {
        return växt;
    }

    public void setVäxt(Växt växt) {
        this.växt = växt;
    }
}

/*
Samma som föregående, arv från växter och implemnterat ett interface Iprint.
Överskrivit några metoder som getName, getHeight och printHowMuchWater från interfacen.
*/