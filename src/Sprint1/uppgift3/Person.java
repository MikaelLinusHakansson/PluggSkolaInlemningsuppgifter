package Sprint1.uppgift3;

public class Person {
    private String name;
    private String personNummer;

    public Person(String name, String personNummer) {
        this.name = name;
        this.personNummer = personNummer;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonNummer() {
        return personNummer;
    }

    public void setPersonNummer(String personNummer) {
        this.personNummer = personNummer;
    }
}


