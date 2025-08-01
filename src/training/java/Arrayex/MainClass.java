package training.java.Arrayex;

public class MainClass {
    public static void main(String[] args) {
        UniverSityMember member = new Student();
        member.setName("John Doe");
        member.setId(12345);
        ((Student) member).setRating(1);
        ((Student) member).getRating();
        ((Student) member).getRating();
        ((Student) member).subject = "Computer Science";
        ((Student) member).study();
        member.work();
        ((Student) member).studentRating();
        UniverSityMember member1 = new Teacher();
        member1.setName("Vijay Kumar");
        member1.setId(23456);
        ((Teacher) member1).setRating(5);
        ((Teacher) member1).getRating();
        ((Teacher) member1).subject = "Mathematics";
        ((Teacher) member1).teach();
        member1.work();
        ((Teacher) member1).rating();

        //System.out.println("Student Name: " + student.getName());
        //System.out.println("Student ID: " + student.getId());
        //System.out.println("Subject: " + student.subject);
    }
}


