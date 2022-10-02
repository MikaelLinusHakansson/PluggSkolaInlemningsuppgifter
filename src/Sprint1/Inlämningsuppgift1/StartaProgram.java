package Sprint1.Inlämningsuppgift1;

import javax.swing.*;

public class StartaProgram {
    public StartaProgram() {
        JOptionPane.showMessageDialog(null, "quit / cancel för att avbryta");
        String extractedName = extractFlower();  // hämtar namnet på blomman sparar i variabel
        while (!extractedName.equalsIgnoreCase("quit")) {
            printOutAmountOfWaterFrom(extractedName);  // skriver ut hur mycket vatten blomman ska ha
            extractedName = extractFlower();
        }
    }

    private static void printOutAmountOfWaterFrom(String name) {
        // ingen kontroll hur vidare namnet är tomt, det görs tidigare.
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
            JOptionPane.showMessageDialog(null, "Du har ingen blommad vid det namnet");  // om blomman inte finns skriv
            // ut annars skriv ut mängden vatten
        }
    }

    private static String extractFlower() {
        /*Om användaren trycker på Cancel så får den ett meddelande och programmet avslutas*/
        try {
            String name = JOptionPane.showInputDialog("Vilken växt ska få vätska?");
            if (name.length() > 0 && !name.isBlank()) {  // kontrollerar så att värderna på namnet är korrekt
                return name;
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Du tryckte på cancel. Programmet avslutas");
            return "quit";
        }
        return "";
    }
}
