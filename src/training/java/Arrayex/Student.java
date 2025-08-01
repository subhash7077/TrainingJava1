package training.java.Arrayex;

public class Student extends UniverSityMember {
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
    void study(){
        System.out.println("Student Name:"+getName());
        System.out.println("Student ID: "+getId());
        System.out.println("Subject: "+subject);
    }

    @Override
    void work() {
        System.out.printf("%s\tis studying\t%s \n",getName(), subject);
    }


    void studentRating() {

            System.out.println(getName()+"'s Rating: " + getRating());

    }
}
