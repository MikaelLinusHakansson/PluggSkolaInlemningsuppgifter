package Sprint1.Inlämningsuppgift1;

public class Kaktus extends Växter{
    public Kaktus(String name) {
        super(name, -1);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getHeightInMeters() {
        return super.getHeightInMeters();
    }

    public String typeOfFlower(){
        String type = getClass().getSimpleName();
        return type;
    }

    @Override
    public void printHowMuchWater() {
        System.out.println(this.getName() + " ska ha 0.2l vatten per dag");
    }
}
