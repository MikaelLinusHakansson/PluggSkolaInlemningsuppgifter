package Sprint1.uppgift3;

import java.util.ArrayList;

public class Lärare extends Person implements schoolMethods{
    private ArrayList<Kurs> kurser;
    private int hurMångaKurserSomGes;

    public Lärare(String name, String personNummer, int antalKurserSomLärarenGer) {
        super(name, personNummer);
        this.kurser = new ArrayList<>();
        this.hurMångaKurserSomGes = antalKurserSomLärarenGer;
    }

    public Kurs findKurs(String namnPåKurs) {  // letar efter en kurs i listan
        if (kurser != null) {
            for (Kurs kurs : kurser) {
                if (namnPåKurs.equals(kurs)) {
                    return kurs;
                }
            }
        }
        return null;
    }

    public boolean addKurs(String namnPåKurs) {  // lägger till en kurs på listan om en ej hittas
        Kurs tempKurs = findKurs(namnPåKurs);
        if (tempKurs != null) {
            return false;
        }
        tempKurs = new Kurs(namnPåKurs);
        kurser.add(tempKurs);
        return true;
    }




    public int getHurMångaKurserSomGes() {
        return hurMångaKurserSomGes;
    }

    @Override
    public String toString() {
        System.out.println("Läraren: " + getName() + " ger " + this.hurMångaKurserSomGes + " kurser: ");
        for (Kurs kurs : kurser) {
            System.out.print(kurs.getNamnPåKurs() + " ");
        }
        return "kurs.getNamnPåKurs();";
    }

    public void printMe(){
        System.out.println("Läraren: " + getName() + " har " + hurMångaKurserSomGes + " kurser: ");
        for (Kurs kurs : kurser) {
            System.out.print(kurs.getNamnPåKurs() + " ");
        }
    }
}
