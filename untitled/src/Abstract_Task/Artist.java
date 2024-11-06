package Abstract_Task;

class Artist extends Person {
    private String artForm; // Specific property for Artist

    // Constructor
    public Artist(String name, String artForm) {
        super(name); // Initialize name from Person class
        this.artForm = artForm; // Initialize artForm specific to Artist
    }

    // Implementing the abstract method from Person
    @Override
    void describeRole() {
        System.out.println(super.toString() + ", Art Form:" + artForm);
    }

}