package Abstract_Task;


class Student extends Person {
    private String school; // Specific property for Student

    // Constructor
    public Student(String name, String school) {
        super(name); // Initialize name from Person class
        this.school = school; // Initialize school specific to Student
    }

    // Implementing the abstract method from Person
    @Override
    void describeRole() {
        System.out.println(super.toString() + ", school:" + school);
    }

}