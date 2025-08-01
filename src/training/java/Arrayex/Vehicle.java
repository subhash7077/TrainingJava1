package training.java.Arrayex;

public abstract class Vehicle {
    private String breaks;
    private String size;

    public void setBreaks(String breaks) {
        this.breaks = breaks;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBreaks() {
        return breaks;
    }

    public String getSize() {
        return size;
    }
    public abstract void wheels();
}
