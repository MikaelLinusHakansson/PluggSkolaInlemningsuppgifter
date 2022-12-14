package Sprint1.Inlämningsuppgift1;

import javax.swing.*;

public class Palm extends Växter implements Iprint {
    public enum Växt{KAKTUS, KÖTTÄTANDE, PALM}
    private Växt växt = Växt.PALM;
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
        JOptionPane.showMessageDialog(null, getVäxt() + " " + this.getName() +
                " ska ha " + amountOfWater + "l kranvatten");
    }

    public Växt getVäxt() {
        return växt;
    }

    public void setVäxt(Växt växt) {
        this.växt = växt;
    }
}

/*
Arv från klassen Växter och implementerat en interaface vid namn Iprint.
Du har samma konstroktor från superklassen sedan överskriver getName,
GetHeight samt polymorfism / överskrivit / override Interface funktionen.
 */