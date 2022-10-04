package Sprint1.uppgift2;

public class Bil extends Fordon implements Hjulburen{
    private int antalVäxlar;
    private int växelJustNu;
    double nuvarandeHastighet;
    private int antalHjul = 4;
    private int maxHastighet;
    public Bil(int maxHastighet, double vikt, int antalVäxlar, int nuvarandeHastighet) {
        super(maxHastighet, vikt);
        this.antalVäxlar = antalVäxlar;
        this.nuvarandeHastighet = nuvarandeHastighet;
        this.maxHastighet = getMaxHastighet();
    }

    public void setNuvarandeHastighet(int nyNuvarandeHastighet) {
        if (nyNuvarandeHastighet > this.getMaxHastighet()) {
            this.nuvarandeHastighet = this.getMaxHastighet();
            växla();
        } else {
            this.nuvarandeHastighet = nyNuvarandeHastighet;
            växla();
        }
    }

    public void växla() {
        if (nuvarandeHastighet > this.getMaxHastighet()) {
            this.växelJustNu = antalVäxlar;
            System.out.println("Du kör nu i max hastighet växeln är --> " + this.växelJustNu);
        }
        if (this.nuvarandeHastighet < 20 && this.nuvarandeHastighet > 0) {
            this.växelJustNu = 2;
        } else if (this.nuvarandeHastighet >= 20 && this.nuvarandeHastighet < 30) {
            this.växelJustNu = 3;
        } else if (this.nuvarandeHastighet >= 30 && this.nuvarandeHastighet < 50) {
            this.växelJustNu = 4;
        } else if (this.nuvarandeHastighet >= 50 && nuvarandeHastighet < 60) {
            this.växelJustNu = 5;
        } else if (nuvarandeHastighet > 60) {
            this.växelJustNu = 6;
        }
       /* if (this.nuvarandeHastighet < 0) {
            System.out.println("Du backar");
        } else if (nuvarandeHastighet > 0) {
            System.out.println("Nuvarande växel --> " + this.växelJustNu);
        }*/
    }

    @Override
    public void printMe() {
        växla();
        System.out.println("Antal växlar: " + antalVäxlar + " växel just nu "
                + this.växelJustNu + " nuvarande hastighet --> " + this.nuvarandeHastighet);
    }

    @Override
    public void ändraHastighet(int ändraHastighet) {
        int maxHastighet = this.getMaxHastighet();
        if(ändraHastighet != maxHastighet) {
            this.setMaxHastighet(ändraHastighet);
        } else {
            return;
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
        return this.maxHastighet;
    }

    @Override
    public void setMaxHastighet(double nyNuvarandeHastighet) {
        if(nyNuvarandeHastighet <= getMaxHastighet()) {
            this.nuvarandeHastighet = nyNuvarandeHastighet;
        }
    }
}
