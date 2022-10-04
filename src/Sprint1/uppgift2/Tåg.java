package Sprint1.uppgift2;

public class Tåg extends  Fordon implements Hjulburen{
    private int antalVagnar;
    private int antalHjul = 16;
    private double nuvarandeHastighet;

    public Tåg(int maxHastighet, double vikt, int antalVagnar, double nuvarandeHastighet) {
        super(maxHastighet, vikt);
        this.antalVagnar = antalVagnar;
        this.nuvarandeHastighet = nuvarandeHastighet;
    }

    public void kopplaVagn(){
        System.out.println("--> koppla vagn");
    }

    @Override
    public void printMe() {
        System.out.println("antal vagnar på tåg= " + antalVagnar);
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
    public int getAntalHjul() {
        System.out.println(getClass().getSimpleName() + " har " + antalHjul + " hjul");
        return this.antalHjul;
    }
    @Override
    public int getMaxHastighet() {
        int getMaxhastighet = getMaxHastighet();
        return getMaxhastighet;
    }
    @Override
    public void setMaxHastighet(double nyNuvarandeHastighet) {
        if(nyNuvarandeHastighet <= getMaxHastighet()) {
            this.nuvarandeHastighet = nyNuvarandeHastighet;
        }
    }
}

