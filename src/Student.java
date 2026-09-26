public class Student extends BSU_Member{
    double gpa;

    Course [] enrolled_courses;

    Student(){
        this.gpa = 0;
        this.enrolled_courses = new Course[6];
        this.status = "Student";



    }

    // Lab 4 - Task 1: overloaded constructor
    Student(double gpa, Course[] enrolled_courses) {
        this.gpa = gpa;
        this.enrolled_courses = enrolled_courses;
        this.status = "Student";
    }

    // lab-work: Create a getter method for enrolled_courses attribute
    // Getter
    public Course[] getEnrolled_courses() {
        return this.enrolled_courses;
    }

    // Setter
    public void setEnrolled_courses(Course[] enrolled_courses) {
        this.enrolled_courses = enrolled_courses;
    }

    @Override

    public void display_information(){
        System.out.println("Status: " + status);
    }

}
