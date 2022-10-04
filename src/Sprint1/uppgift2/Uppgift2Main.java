package Sprint1.uppgift2;

public class Uppgift2Main {
    public static void main(String[] args) {
        Bil bil = new Bil(200, 1200, 6, 70);
        Båt båt = new Båt(200, 700, 70, 100);
        Tåg tåg = new Tåg(300, 5000, 7, 200);
        Cykel cykel = new Cykel(40, 12, 20);
        bil.printMe();
        båt.printMe();
        tåg.printMe();
        cykel.printMe();

        bil.getAntalHjul();
        tåg.getAntalHjul();
        cykel.getAntalHjul();

    }
}
