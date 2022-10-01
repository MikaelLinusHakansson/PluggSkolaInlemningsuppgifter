package Sprint1.Inlämningsuppgift1;


public class InlämingMain {
    public static void main(String[] args) {

        /*Tre subklasser: växter, Palm, köttätande växt, kaktus. De är alla växter så skapa en Superklass namn "Växter".
         * Gemensamt:
         * De ska alla vattnas, de har alla ett namn, de har alla en längd.
         * Användning av JOptionPane.InputDialog fråga efter vilken växt som ska vattnas, fråga efter namn.
         * Växterna som ska implementeras:
         * Kaktusen Igge, 0.2m hög
         * Palmen Laura, 5m hög
         * Köttätande växten Meatloaf 0.7m hög
         * Palmen putte 1 meter hög.
         * Börja med att skapa en Superklass, sedan implementera subklasserna.*/
        Kaktus nykaktus = new Kaktus("Igge");
        nykaktus.printHowMuchWater();

        KöttätandeVäxt nyKöttis = new KöttätandeVäxt("Meatloaf", 0.7);
        nyKöttis.printHowMuchWater();
         /*Fortsätt med palmer*/
    }
}


// https://studentportal.nackademin.se/pluginfile.php/298419/mod_resource/content/0/Inl%C3%A4mningsuppgift%201_uppdaterad_DISTANS.pdf
