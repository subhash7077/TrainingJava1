package training.java.Arrayex;

public class Bus extends Vehicle{
    @Override
    public void wheels() {
        System.out.printf("Bus has %s wheels and %s\n", getSize(), getBreaks());
    }
}
