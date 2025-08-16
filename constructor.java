 public class constructor {
    String name;
    int age;

    // Constructor
    public constructor(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display data
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects using constructor
        constructor s1 = new constructor("Bhagya", 20);
        constructor s2 = new constructor("Lakshmi", 21);

        // Displaying data
        s1.display();
        s2.display();
    }
}
 
    
