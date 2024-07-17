public class Person {
    // Instance variables
    private String name;
    private int age;
    private String address;
    
    // Constructor with three parameters
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    // Method to display person's details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
    
    // Method to call displayDetails on a Person object
    public void myDetails(Person person) {
        person.displayDetails();
    }
    
    // Method to print details of the current instance
    public void printCurrentInstance() {
        displayDetails();
    }
    
    // Main method to create object and test methods
    public static void main(String[] args) {
        // Create an object of Person
        Person charles = new Person("Charles", 19, " 00100, Nairobi");

        // Call printCurrentInstance method using the object
        charles.printCurrentInstance();
    }
}
