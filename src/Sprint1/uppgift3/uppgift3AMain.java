package Sprint1.uppgift3;

public class uppgift3AMain {
    public static void main(String[] args) {
        Kurs biologi = new Kurs("Biologi");
        Lärare AndersHåkansson = new Lärare("Anders Håkansson", "156789", 4);
        Lärare RolandHåkansson = new Lärare("Roland Håkansson", "92392042", 3);
        Lärare GustafAndersson = new Lärare("Gustaf andersson", "4953481", 5);
        Lärare PeterKarlsson = new Lärare("Peter karlsson", "15648612", 2);

        biologi.setLärare(AndersHåkansson);

        Student Linus = new Student("Linus", "4984351486132", 4);
        Linus.addKurs("Biologi");
        Linus.addKurs("Historia");
        Linus.addKurs("Svenska");
        Linus.addKurs("Samhällskunskap");

        AndersHåkansson.addKurs("Biologi");
        RolandHåkansson.addKurs("Historia");
        GustafAndersson.addKurs("Svenska");
        PeterKarlsson.addKurs("Samhällskunskap");


        AndersHåkansson.printMe();
        System.out.println();
        RolandHåkansson.printMe();
        System.out.println();
        GustafAndersson.printMe();
        System.out.println();
        PeterKarlsson.printMe();
        System.out.println();
        Linus.printMe();
    }
}
