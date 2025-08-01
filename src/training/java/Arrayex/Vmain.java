package training.java.Arrayex;

public class Vmain {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.setBreaks("Drum Break");
        v1.setSize("4");
        v1.wheels();
        Vehicle v= new Bus();
        v.setBreaks("Disc Break");
        v.setSize("6");
        v.wheels();
    }
}
