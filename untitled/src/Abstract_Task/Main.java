package Abstract_Task;

public class Main {
    public static void main(String[] args) {

        Artist newArtist = new Artist("Leonardo","oil painting");
        Employee NewEmployee = new Employee("Ibrahim","Boubyan Bank");
        Student newStudent = new Student("Adnan","Columbia University");
        Teacher newTeacher = new Teacher("Ali","Java",8,"Coded");

        newArtist.describeRole();
        NewEmployee.describeRole();
        newStudent.describeRole();
        newTeacher.describeRole();
    }
}