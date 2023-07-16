package oops;
class Student{
    int rollNo;
    String studentName;
}
public class main {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.rollNo = 23;
        obj1.studentName = "Satish";
        System.out.println(obj1.rollNo);
        System.out.println(obj1.studentName);

        Student obj2 = new Student();
        obj2.studentName = "Manish";
        obj2.rollNo = 20;
        System.out.println(obj2.studentName);
        System.out.println(obj2.rollNo);
    }
}
