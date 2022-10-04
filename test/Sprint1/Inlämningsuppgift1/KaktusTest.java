package Sprint1.Inlämningsuppgift1;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class KaktusTest{
    public Kaktus p = new Kaktus("asd", 20);

    @Test
    void testGetName() {
        assert (p.getName().equals("asd"));
        assert (!p.getName().equals("dsa"));  // testar om namnet stämmer överens.
    }

    @Test
    void testGetHeightInMeters() {
        assert (p.getHeightInMeters() != 10);
        assert (p.getHeightInMeters() == 20);
    }

    @Test
    void getVäxt(){
        assert (p.getVäxt().equals(Kaktus.Växt.KAKTUS));  // testar om getters funkar
        assert (!p.getVäxt().equals(Kaktus.Växt.PALM));
    }

    @Test
    void setVäxt(){
        assert (p.getVäxt().equals(Kaktus.Växt.KAKTUS));  // testar om setters funkar.
        p.setVäxt(Kaktus.Växt.PALM);
        assert(!p.getVäxt().equals(Kaktus.Växt.KAKTUS));
    }

    @Test
    void printHowMuchWater() {
        assert (p.getVäxt().equals(Kaktus.Växt.KAKTUS));
        assert (!p.getVäxt().equals(Kaktus.Växt.PALM));
        assert (p.getName().equalsIgnoreCase("asd"));
        assert (!p.getName().equalsIgnoreCase("laura"));
    }
}