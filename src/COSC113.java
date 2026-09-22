public class COSC113  extends Course{
    // Public, default, protected attributes are inherited
    // Private attributes are not inherited

    String syllabus;
    String coding_language;
    Instructor[] i1;
    Student[] student;


    // Simple Constructor
    COSC113() {
        this.syllabus = "Java";
        this.coding_language = "Java";
        this.i1 = null;
        this.student = null;

    }


    // Overloaded Constructor
    COSC113(int course_number, int credit, String name) {
        // super() will invoke the parent class's default constructor - Course()
        // super();

        super(course_number, credit, name);

        this.syllabus = "Java";
        this.coding_language = "Java";
        this.i1 = null;
        this.student = null;

    }
    // Methods: Public, default, protected methods are inherited
    // Setters and Getters - Lab Work


    // Method Overriding: Defining a method with the same method signature from the parent class
    @Override
    public void display_course_information() {

        super.display_course_information();
        System.out.println("Syllabus: " + this.syllabus + " Language: " + this.coding_language +
                " Instructor: " + this.i1 + " Students: " + this.student );
    }


    // Constructors are not inherited, but can be invoked/called


    // Methods: Public, default, protected methods are inherited


    // Package: Java files under the same folder are considered
    // to be in the same package

}




