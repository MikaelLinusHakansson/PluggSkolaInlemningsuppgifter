package Sprint1.Inlämningsuppgift1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KöttätandeVäxtTest{

    KöttätandeVäxt köttis = new KöttätandeVäxt("meatLoaf", 0.7); // height in meters.
    @Test
    void testPrintHowMuchWater() {
        double proteinDrink = 0.1 + (köttis.getHeightInMeters() * 0.2);
        assert (proteinDrink == 0.24);
        assert (proteinDrink != 0);
    }
}