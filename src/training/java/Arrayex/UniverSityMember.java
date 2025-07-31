package training.java.Arrayex;

public class UniverSityMember{
    private String name;
    private int id;
    private int rating;

    public void setName(String name) {

        this.name = name;
    }

    public void setId(int id) {

        this.id = id;
    }
    public void setRating(int rating) {

        this.rating = rating;
    }
    public String getName() {

        return name;
    }
    public int getId()
    {
        return id;
    }
    public int getRating() {
        if(rating >=0&&rating <= 5) {
            return rating;
        }
        else {
            System.out.println("Rating should be between 0 and 5");
            return -1;
        }
    }
    void work() {
        System.out.println("University Member is working");
    }

}
