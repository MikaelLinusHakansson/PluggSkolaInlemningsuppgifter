package Sprint1.uppgift3;

import java.util.ArrayList;
import java.util.List;

public class Kurs {
    private String namnPåKurs;
    private Lärare lärare;

    private List<Student> students;

    public Kurs(String namnPåKurs) {
        this.namnPåKurs = namnPåKurs;
        this.students = new ArrayList<>();
    }

    public String getNamnPåKurs() {
        return namnPåKurs;
    }

    public void setNamnPåKurs(String namnPåKurs) {
        this.namnPåKurs = namnPåKurs;
    }

    public void setLärare(Lärare lärare) {
        this.lärare = lärare;
    }

    public void taBortlärare() {
        this.lärare = null;
    }

    public Lärare getLärare() {
        return lärare;
    }

    public boolean addStudents(String name, String personNummer, int antalKurser) {
        Student tempStudents = findStudent(name);
        if (tempStudents != null) {
            return false;
        }
        tempStudents = new Student(name, personNummer, antalKurser);
        students.add(tempStudents);
        return true;
    }

    public Student findStudent(String namnPåStudent) {
        for (Student student : students) {
            if (namnPåStudent.equals(student)) {
                return student;
            }
        }
        return null;
    }
}
