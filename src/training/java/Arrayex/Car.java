package training.java.Arrayex;

public class Car extends Vehicle{
    @Override
    public void wheels() {
        System.out.printf("Car has %s wheels and %s \n",getSize(), getBreaks());
    }
}
