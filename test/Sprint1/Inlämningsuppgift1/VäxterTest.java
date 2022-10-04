package Sprint1.Inlämningsuppgift1;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class VäxterTest {
    Växter p = new Växter("asd", 1.0);
    @org.junit.jupiter.api.Test
    void getName() {
        assert (p.getName().equals("asd"));
        assert (!p.getName().equals("dsa"));
    }

    @org.junit.jupiter.api.Test
    void getHeightInMeters() {
        assert(p.getHeightInMeters() == 1.0);
        assert (p.getHeightInMeters() != 0);
    }
}