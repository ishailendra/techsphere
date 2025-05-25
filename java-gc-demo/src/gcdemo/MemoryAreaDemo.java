package gcdemo;

public class MemoryAreaDemo {

    public static void main(String[] args) {
        int age = 42;                    // Primitive on stack
        String greeting = "Hello, World!";    // String literal in method area
        Person person = new Person("Alice", age);  // Object on heap

        person.sayHello(greeting);
    }
}

class Person {
    private String name; // Reference to String in method area
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello(String msg) {
        System.out.println(name + " says: " + msg);
    }
}
