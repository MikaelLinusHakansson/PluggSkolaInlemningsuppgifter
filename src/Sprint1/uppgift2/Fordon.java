package Sprint1.uppgift2;

public abstract class Fordon implements IPrintable {
    private int maxHastighet;
    private double vikt;


    public Fordon(int maxHastighet, double vikt) {
        this.maxHastighet = maxHastighet;
        this.vikt = vikt;
    }
    public abstract void ändraHastighet(int ändraHastighet);

    public abstract int getMaxHastighet();

    public abstract void setMaxHastighet(double nuvarandeHastighet);
}
