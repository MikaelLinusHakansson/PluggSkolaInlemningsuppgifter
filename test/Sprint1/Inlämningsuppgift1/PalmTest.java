package Sprint1.Inlämningsuppgift1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest{
    Palm laura = new Palm("Laura", 5);
    @Test
    void testPrintHowMuchWater() {
        double amountOfWater = 0.5 * laura.getHeightInMeters();
        assert (amountOfWater == 2.5);
        assert (amountOfWater != 1);
    }
}