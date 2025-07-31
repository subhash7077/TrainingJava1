package training.java.Arrayex;

public class MainClass {
       public static void main(String[] args) {
              UniverSityMember member = new UniverSityMember();
              member.setName("John Doe");
              member.setId(12345);
              member.setRating(3);
              Student student = new Student();
              student.setName(member.getName());
              student.setId(member.getId());
              student.setRating(member.getRating());
              student.subject = "Computer Science";
              student.study();
              student.work();
              student.studentRating();
              member.setName("Jane Smith");
              member.setId(67890);
              member.setRating(2);
              Teacher teacher = new Teacher();
              teacher.setName(member.getName());
              teacher.setId(member.getId());
              teacher.setRating(member.getRating());
              teacher.subject = "Mathematics";
                teacher.teach();
                teacher.work();
                teacher.rating();

              //System.out.println("Student Name: " + student.getName());
              //System.out.println("Student ID: " + student.getId());
              //System.out.println("Subject: " + student.subject);
       }
}


