public class Course {

        String name;
        int course_number;
        int credit;

        private String classroom;

        // Students
        // Instructor


        Course() {
            name = "";
            course_number = 0;
            credit = 0;
        }


        Course(int course_number, int credit, String name) {
            this.course_number = course_number;
            this.credit = credit;
            this.name = name;
        }


        // Setters and getters are similar to methods
        // Methods signature: Access_modifier, Return_type, Method_name (Param_type Param_name)
        // Return types: void, int, String, boolean, char, array of objects

        // Lab 4 - Task 3: setters and getters
        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCourse_number() {
            return this.course_number;
        }

        public void setCourse_number(int course_number) {
            this.course_number = course_number;
        }

        public int getCredit() {
            return this.credit;
        }

        public void setCredit(int credit) {
            this.credit = credit;
        }

        public void Set_Classroom(String classroom) {
            this.classroom = classroom;
        }


        public String get_Classroom() {
            return this.classroom;
        }


        // Method for displaying attribute values
        public void display_course_information() {
            System.out.println("Course name: " + this.name + "Course number: " + this.course_number);
        }
}
