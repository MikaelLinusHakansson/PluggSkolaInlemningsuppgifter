package Sprint1.uppgift1;

public class Uppgift1Main {
    public static void printBil(Bil bil) {
        if (bil.getÄgare() == null) {
            System.out.println("Bilen med regnummer " + bil.getRegNummer() + " har ingen ägare");
            return;
        }
        System.out.println("Bilen med regnummer " + bil.getRegNummer() + " av modellen "
                + bil.getModell()
                + " ägs av "
                + bil.getÄgare().getNamn());
    }

    public static void main(String[] args) {
        Bilägare Bosse = new Bilägare("Bosse", "Bilvägen 3", 65);
        Bilägare Lisa = new Bilägare("Lisa", "Laduvägen 8", 27);
        Bilägare Kim = new Bilägare("Kim", "Kalasvägen 6", 37);
        Bil rödaSaaben = new Bil("XYZ 123", "Saab");
        Bil vitaVolvon = new Bil("ERT 432", "Volvo");

        rödaSaaben.ägsAv(Bosse);
        vitaVolvon.ägsAv(Lisa);
        rödaSaaben.såld();
        rödaSaaben.ägsAv(Kim);

        printBil(rödaSaaben);
        printBil(vitaVolvon);
    }
}
