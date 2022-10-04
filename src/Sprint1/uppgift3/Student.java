package Sprint1.uppgift3;

import java.util.ArrayList;

public class Student extends Person implements schoolMethods{
    private ArrayList<Kurs> kurser;
    private int antalKurser;

    public Student(String name, String personNummer, int antalKurser) {
        super(name, personNummer);
        this.kurser = new ArrayList<>();
        this.antalKurser = antalKurser;
    }

    public boolean addKurs(String namnPåKurs) {
        Kurs tempKurs = findKurs(namnPåKurs);  // testar om kursen finns
        if (tempKurs != null) {
            return false;
        }
        tempKurs = new Kurs(namnPåKurs);  // om den ej finns lägg till den i listan!
        kurser.add(tempKurs);
        return true;
    }

    public Kurs findKurs(String namnPåKurs) {
            for (Kurs kurs : kurser) {
                if (namnPåKurs.equals(kurs)) {
                    return kurs;
                }
            }
        return null;
    }

    public int getAntalKurser() {
        return antalKurser;
    }

    public void setAntalKurser(int antalKurser) {
        this.antalKurser = antalKurser;
    }


    public void printMe(){
        System.out.println("Eleven: " + getName() + " går dessa " + this.antalKurser + " kurser: ");
        for (Kurs kurs : kurser) {
            System.out.print(kurs.getNamnPåKurs() + " ");
        }
    }

}
