package Abstract_Task;

class Employee extends Person {
    private String company; // Specific property for Employee

    // Constructor
    public Employee(String name, String company) {
        super(name); // Initialize name from Person class
        this.company = company; // Initialize company specific to Employee
    }

    // Implementing the abstract method from Person
    @Override
    void describeRole() {
        System.out.println(super.toString() + ", company:" + company);
    }
}

