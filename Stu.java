public class Stu {
    int marks;
    String name;

    public static void main(String[] args) {
        Stu obj1 = new Stu();
        Stu obj2 = new Stu();
        
        System.out.println(obj1.marks); // default int value = 0
        System.out.println(obj2.name);  // default String value = null
    }
}
