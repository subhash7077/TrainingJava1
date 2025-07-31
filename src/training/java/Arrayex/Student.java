package training.java.Arrayex;

public class Student extends UniverSityMember {
    String subject;
    void study(){
        System.out.println("Student Name:"+getName());
        System.out.println("Student ID: "+getId());
        System.out.println("Subject: "+subject);
    }

    @Override
    void work() {
        System.out.println(getName()+"\t Student is studying\t" +subject);
    }
    void studentRating() {

            System.out.println(getName()+"'s Rating: " + getRating());

    }
}
