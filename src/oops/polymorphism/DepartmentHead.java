package oops.polymorphism;

public class DepartmentHead extends Faculty {

    public void duty_b() {
        super.duty_a();
        System.out.println("Conduct duties of a department head.\n");
    }
}
