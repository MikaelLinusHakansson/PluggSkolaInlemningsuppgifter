package Sprint1.Inlämningsuppgift1;

import javax.swing.*;

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

    public String getName() {
        return name;
    }

    public double getHeightInMeters() {
        return heightInMeters;
    }
}
