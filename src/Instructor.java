public class Instructor extends BSU_Member {
    String departement;

    Instructor(){
        this.departement = "CS";
        this.status = "Faculty";

    }

    // Lab 4 - Task 1: overloaded constructor
    Instructor(String departement, String status) {
        this.departement = departement;
        this.status = status;
    }

    // Task: Create a display method that will print the departement and status
    @Override
    public void display_information() {
        System.out.println("Departement: " + this.departement + " Faculty: " + this.status);
    }


}
