package training.java.Arrayex;

public class Teacher extends UniverSityMember {
    String subject;
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
