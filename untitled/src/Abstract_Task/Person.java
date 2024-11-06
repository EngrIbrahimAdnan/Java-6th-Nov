package Abstract_Task;

abstract class Person {
    private String name; // Common property for all persons

    // Constructor to initialize the name
    public Person(String name) {
        this.name = name;
    }

    // Common method to get the person's name
    public String getName() {
        return name;
    }

    // Abstract method that must be implemented by subclasses
    abstract void describeRole();

    @Override
    public String toString() {
        return "name: " + name;
    }
}