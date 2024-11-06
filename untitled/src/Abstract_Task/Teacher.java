package Abstract_Task;


class Teacher extends Person {
    private String subject;
    private int yearsOfExperience;
    private String school;

    // Constructor
    public Teacher(String name, String subject, int yearsOfExperience, String school) {
        super(name);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.school = school;
    }

    // Implementing the abstract method from Person
    @Override
    void describeRole() {
        System.out.println(super.toString() + ", Teaches:" + subject + ", years of Experience:" + yearsOfExperience + ", school:" + school);
    }

}