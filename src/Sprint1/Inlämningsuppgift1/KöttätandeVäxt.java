package Sprint1.Inlämningsuppgift1;

import javax.swing.*;

public class KöttätandeVäxt extends Växter implements Iprint {
    public enum Växt{KAKTUS, KÖTTÄTANDEVÄXT, PALM}
    private Växt växt = Växt.KÖTTÄTANDEVÄXT;
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
        JOptionPane.showMessageDialog(null, getVäxt() + " " + this.getName()
                + " ska ha " + proteinDrink + "l proteindryck");
    }

    public Växt getVäxt() {
        return växt;
    }

    public void setVäxt(Växt växt) {
        this.växt = växt;
    }
}

/*
Nästan exakt samma som de tidigare klasserna fast såklart med en override för Iprint.
* */