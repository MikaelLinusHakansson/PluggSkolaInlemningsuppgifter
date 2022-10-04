package MoocFi.part6.HeightOrder;

import java.util.ArrayList;

public class Room {
    private ArrayList<Person> person;

    public Room() {
        this.person = new ArrayList<>();
    }

    public void add(Person person) {
        if (person != null) {
            this.person.add(new Person(person.getName(), person.getHeight()));
        }
    }

    public boolean isEmpty() {
        return getPersons().isEmpty();
    }

    public ArrayList<Person> getPersons() {
        if (this.person != null) {
            return person;
        }
        return null;
    }

    public Person shortest() {
        if(this.person.isEmpty()) {
            return null;
        }
        Person tempPerson = this.person.get(0);
        for (Person person1 : person) {
            if(tempPerson.getHeight() > person1.getHeight()) {
                tempPerson = person1;
            }
        }
        return tempPerson;
    }

    public Person take(){
        if(person.isEmpty()){
            return null;
        }
        Person tempPerson = person.get(0);
        for (Person person1 : person) {
            if(tempPerson.getHeight() > person1.getHeight()) {
                tempPerson = person1;
            }
        }
        this.person.remove(tempPerson);
        return tempPerson;
    }
}
