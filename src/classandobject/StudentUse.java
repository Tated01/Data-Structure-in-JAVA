package classandobject;

public class StudentUse {
    public static void main(String[] args) {
        Student s1 = new Student();
        // Student s2 = new Student();

        s1.name = "Tated";
        s1.rollNumber = 1087;

        System.out.println(s1.name + " " + s1.rollNumber);
    }
}
