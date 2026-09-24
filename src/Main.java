public class Main {
    public static void main(String[] args) {
        Course c1 = new Course();
        c1.display_course_information();

        COSC113 c2 = new COSC113();
        c2.display_course_information();

        // Polymorphism
        Course cosc214 = new Course();
        Course section2 = new COSC113();
        // The relationship is : IS-A relationship between Course and COSC113

        cosc214.display_course_information();
        section2.display_course_information();

        // Student object
        Student arturo = new Student();
        Course math141 = new Course();
        Course frac = new Course();
        Course cosc107 = new Course();
        Course eng102 = new Course();
        Course soc101 = new Course();

        arturo.enrolled_courses[0] = math141;

        // lab work populate index 1 to 4 with other course references

       // Instructor i1 = new Instructor();
       // i1.display_information();

        BSU_Member []members = new BSU_Member[10];

        BSU_Member b1, b2;
        // Creating an object of Student type and storing the reference in a BSU_Member type variable
        b1 = new Student();
        b2 = new Instructor();

        members[0] = b1;
        members[1] = b2;


        System.out.println("-----------------------");
        for (int j = 2; j<10; j++) {
            members[j] = new BSU_Member();
        }


        System.out.println("-----------------------");
        for (int j = 2; j<10; j++) {
            members[j].display_information();
        }





    }

}
