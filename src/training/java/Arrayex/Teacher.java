package training.java.Arrayex;

public class Teacher extends UniverSityMember {
    String subject;
    private int rating;
    public void setRating(int rating) {
        if(rating>0&&rating<=5) {
            this.rating = rating;
            System.out.printf("%s's rating is set to %d\n", getName(), rating);
        } else {
            System.out.println("Rating should be between 1 and 5");
        }
    }
    public int getRating() {
        return rating;
    }
    void teach() {
        System.out.println("Teacher Name: " + getName());
        System.out.println("Teacher ID: " + getId());
        System.out.println("Subject: " + subject);
    }

    @Override
    void work() {
        System.out.println(getName() + "\tis teaching\t"+ subject);
    }
    void rating() {
        System.out.println(getName()+ "'s Rating: " + getRating());
    }
}
