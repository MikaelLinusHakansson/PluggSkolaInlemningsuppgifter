package Sprint1.Inlämningsuppgift1;

public class Växter {
    private String name;
    private double heightInMeters;

    public Växter(String name, double heightInMeters) {
        if (!name.isEmpty() && heightInMeters > 0) {
            this.name = name;  // inkapsulation kontrollerar så ingen ogiltiga värden kan passera.
            this.heightInMeters = heightInMeters;
        } else {
            System.out.println("Invalid values");
        }
    }

    //    detta är en superklass så dessa getters är återkommande i subklasserna med polymorfism
    public String getName() {
        return name;
    }  // encapsulation

    public double getHeightInMeters() {
        return heightInMeters;
    }  // encapsulation
}



/*
Du har gemensamma variabler som exempelvis namn och deras höjd / storlek.
Konstruktorn tar emot namn och höjd samt gör en kontroll så värderna är korrekta.
Om dem inte är det så skrivs ett felmeddelande ut. Getters för namn och höjd.
*/
