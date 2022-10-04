package Sprint1.uppgift1;

import java.util.ArrayList;

public class Bil {
    private Bilägare ägare;
    private String regNummer;
    private String modell;

    public Bil(String registreringsNummer, String modellPåBil) {
        this.regNummer = registreringsNummer;
        this.modell = modellPåBil;
    }

    public void ägsAv(Bilägare ägare) {
        this.ägare = ägare;
    }

    public void såld() {
        this.ägare = null;
    }

    public Bilägare getÄgare() {
        return ägare;
    }

    public String getRegNummer() {
        return regNummer;
    }

    public String getModell() {
        return modell;
    }

    public void printCar(Bil bil) {
        if (ägare != null) {
            System.out.println(bil.ägare.getNamn() + " owns " + bil.getModell() +
                    ", registration number " + bil.getRegNummer());
            return;
        }
        System.out.println("har ingen ägare");
    }
}
