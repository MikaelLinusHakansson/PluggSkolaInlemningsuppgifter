package Sprint1.Inlämningsuppgift1;

import javax.swing.*;

public class StartaProgram {

    public StartaProgram() {
        JOptionPane.showMessageDialog(null, "quit / cancel för att avbryta");
        String extractedName = extractFlower();  // hämtar namnet på blomman sparar i variabeln extractedName
        while (!extractedName.equalsIgnoreCase("quit")) {
            printOutAmountOfWaterFrom(extractedName);  // skriver ut hur mycket vatten blomman ska ha
            extractedName = extractFlower();  // gör bara upprepande anrop till extractFlower.
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
            JOptionPane.showMessageDialog(null, "Du har ingen blommad vid det namnet");
            /* om blomman inte finns skriv
             ut annars skriv ut mängden vatten*/
        }
    }

    private static String extractFlower() {
        // Om användaren trycker på Cancel så får den ett meddelande och programmet avslutas
        try {
            String name = JOptionPane.showInputDialog("Vilken växt ska få vätska?");
            if (name.length() > 0 && !name.isBlank()) {  // kontrollerar så att värderna på namnet är korrekt
                return name;
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Du valde att avsluta programmet. Bye!");
            return "quit";
        }
        return "";
    }
}

/*
Här i sker all "magi" som jag nämnde tidigare att jag tyckte var fult i mainklassen.
Först kommer en dialogruta som berättar hur du avbryter körningen av programmet.
Sedan skapas en variabel som anropar en metod för att ta ett namn på en blomma ifyllt av användaren.
Sedan kommer en iteration som pågår tills användaren skriver "quit"
I iterationen så skriver programmet ut mängden vatten en blomma ska tills
användaren trycker quit eller cancel i JOptionPane.

extractFlower()
första man ser är en try-catch som fångar om strängen användaren matar in är tom t.ex. om användaren inte skriver i
någonting och bara trycker på OK i JOptionpane.
Sedan frågar metoden vilken växt användaren vill få information om. OM det användaren skriver in
är större än 0 (bokstäver) OCH INTE är tomt så returnerar
metoden en string som sedan sparas i konstruktorn - extractedName. Om det inte är fallet så har användaren tryckt
på cancel och metoden returnerar "quit" vilket sparas i extractedName och avslutar iterationen / programmet
samt ett meddelande som berättar att programmet avslutas.

Sista returen är ifall användaren som sagt inte skriver in någonting alls så sparas en tom sträng, detta undviker att
metoden blir null och att man får ett felmeddelande.

printOutAmountOfWaterFrom:
Tar emot en sträng och returnerar ingenting. Denna metod kollar vilken blomma användaren vill ha information om samt
står för skapelsen av alla blommor / objekt.
*/