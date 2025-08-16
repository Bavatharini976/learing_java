public class Student {
    String name;
    int rollno;

    public void display() {
        System.out.println(name);
        System.out.println(rollno);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Tharini";
        s.rollno = 84;
        s.display();
    }
}
