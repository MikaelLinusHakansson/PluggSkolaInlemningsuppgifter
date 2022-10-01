package Sprint1.Inlämningsuppgift1;


import javax.swing.*;

public class InlämingMain {


    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Namn på växt: ");
        printing(name);
    }

    /*
    Skulle vilja ha detta i en egen klass gömt någonstans.
    Frågan är, blir det godkänt?
    */
    public static void printing(String name) {
        Kaktus Igge = new Kaktus("Igge", 0.20);
        KöttätandeVäxt meatloaf = new KöttätandeVäxt("Meatloaf", 0.7);
        Palm laura = new Palm("Laura", 5);
        Palm putte = new Palm("Putte", 1);
        if (name.equalsIgnoreCase(Igge.getName())) {
            Igge.printHowMuchWater();
        } else if (name.equalsIgnoreCase(laura.getName())) {
            laura.printHowMuchWater();
        } else if (name.equalsIgnoreCase(putte.getName())) {
            putte.printHowMuchWater();
        } else if (name.equalsIgnoreCase(meatloaf.getName())) {
            meatloaf.printHowMuchWater();
        } else {
            System.out.println("Du har ingen blommad vid det namnet");
        }

        /* med tanke på att programmet är
         så litet så går det att kontrollera datan på detta sättet*/
    }
}


// https://studentportal.nackademin.se/pluginfile.php/298419/mod_resource/content/0/Inl%C3%A4mningsuppgift%201_uppdaterad_DISTANS.pdf
