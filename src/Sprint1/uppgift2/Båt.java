package Sprint1.uppgift2;

public class Båt extends Fordon{
    private double döVikt;
    private double nuvarandeHastighet;



    public Båt(int maxHastighet, double vikt, double döVikt, int nuvarandeHastighet) {
        super(maxHastighet, vikt);
        this.döVikt = döVikt;
        this.nuvarandeHastighet = nuvarandeHastighet;
    }

    public void säng(String svänga){
        System.out.println(this.getClass().getSimpleName() + " --> sänger " + svänga);
    }

    @Override
    public void printMe() {
        System.out.println(getClass().getSimpleName() + " dövikt: " + this.döVikt);
    }

    @Override
    public void ändraHastighet(int ändraHastighet) {
        int maxHastighet = getMaxHastighet();
        if(ändraHastighet != maxHastighet) {
            setMaxHastighet(ändraHastighet);
        }
        System.out.println("Du ändrade hastighet --> " + getMaxHastighet());
    }
    @Override
    public int getMaxHastighet() {
        int getMaxhastighet = getMaxHastighet();
        return getMaxhastighet;
    }

    @Override
    public void setMaxHastighet(double nyNuvarandeHastighet) {
        if(nyNuvarandeHastighet <= getMaxHastighet()) {
            this.nuvarandeHastighet = (nyNuvarandeHastighet * 1.852);
        }
    }
}
