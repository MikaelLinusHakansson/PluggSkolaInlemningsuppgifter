package Sprint1.uppgift2;

public class Cykel extends Fordon implements Hjulburen {
    private int antalVäxlar;
    private int växelJustNu;
    private double nuvarandeHastighet;
    private int antalHjul = 2;

    public Cykel(double vikt, int antalVäxlar, int nuvarandeHastighet) {
        super(60, vikt);
        this.antalVäxlar = antalVäxlar;
        this.nuvarandeHastighet = nuvarandeHastighet;
    }

    public void växla() {
        if (nuvarandeHastighet <= 10 && nuvarandeHastighet > 0) {
            växelJustNu += 1;
        } else if (nuvarandeHastighet >= 10 && nuvarandeHastighet < 20) {
            växelJustNu += 2;
        } else if (nuvarandeHastighet >= 20) {
            växelJustNu += 3;
        }
    }


    @Override
    public void printMe() {
        växla();
        System.out.println("Cykeln rör sig i en hastighet av " + (int)this.nuvarandeHastighet + "km/h nuvarande växel= " + this.växelJustNu + " antal växlar på cykeln= " + this.antalVäxlar);
    }

    @Override
    public void ändraHastighet(int ändraHastighet) {
        int maxHastighet = getMaxHastighet();
        if(ändraHastighet != maxHastighet){
            setMaxHastighet(ändraHastighet);
            växla();
        }
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

    @Override
    public int getAntalHjul() {
        System.out.println(getClass().getSimpleName() + " har " + antalHjul + " hjul");
        return this.antalHjul;
    }
}
