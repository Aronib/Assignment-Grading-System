import oops.abstraction.Akash;
import oops.abstraction.Student;
import oops.encapsulation.Payment;
import oops.inheritance.AcademicBooks;
import oops.polymorphism.DepartmentHead;

import java.util.Scanner;

public class Main {

    float sum, avg;
    static int i;
    static float[] grade = new float[5];
    public Main(){
        this.avg = 0;
        this.sum = 0;
        this.i =0;
    }

    public void result (float avg){
        if (avg >= 95 && avg <= 100) {
            System.out.println(avg + " A");
        } else if (avg >= 90 && avg < 95) {
            System.out.println(avg + " A-");
        } else if (avg >= 85 && avg < 90) {
            System.out.println(avg + " B+");
        } else if (avg >= 80 && avg < 85) {
            System.out.println(avg + " B");
        } else if (avg >= 75 && avg < 80) {
            System.out.println(avg + " B-");
        } else if (avg >= 70 && avg < 75) {
            System.out.println(avg + " C+");
        } else if (avg >= 65 && avg < 70) {
            System.out.println(avg + " C");
        } else if (avg >= 60 && avg < 65) {
            System.out.println(avg + " C-");
        } else if (avg >= 55 && avg < 60) {
            System.out.println(avg + " D+");
        } else if (avg >= 50 && avg < 55) {
            System.out.println(avg + " D");
        } else if (avg < 55) {
            System.out.println(avg + " Fail");
        } else {
            System.out.println("Invalid Marks Entered");
        }
    }

    String sub = "Introduction to Computer Science";
    public static String title = "Introduction to Computer Science";
    public static String author = "Author";
    public static int numOP = 342;

    public static String id = "1122334455";
    public static float amount = 75000;
    public static String bName = "MD. Mahady";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your marks for 5 subjects:");
        for (i = 0; i < 5; i++) {
            grade[i] = scan.nextFloat();
        }

        gradingSystemForLoop forLoop = new gradingSystemForLoop();
        gradingSystemDoWhile doWhileLoop = new gradingSystemDoWhile();
        gradingSystemWhile whileLoop = new gradingSystemWhile();

        forLoop.gradingForLoop();
        doWhileLoop.gradeDoWhile();
        whileLoop.gradeWhile();

        // Abstraction

        System.out.println("----------Abstraction------------\n");

        Student student = new Akash();
        student.university();
        student.name();
        student.result();

        //Polymorphism

        System.out.println("----------Polymorphism------------\n");

        DepartmentHead A = new DepartmentHead();

        A.details();
        A.duty_b();

        //Inheritance

        System.out.println("----------Inheritance------------\n");

        AcademicBooks book = new AcademicBooks();
        book.provideInformation();
        book.displayInfo(title,author, numOP);

        System.out.println("----------Encapsulation------------\n");



        Payment payment = new Payment();
        payment.setAmount(66587.9F);
        payment.setAccID(1199);
        payment.setBeneficiaryName("MD Mahady");

            System.out.println("Your payment account ID is: " + payment.getAccID());
            System.out.println("Your paid amount is: " + payment.getAmount());
            System.out.println("Name of the beneficiary is: " + payment.getBeneficiaryName());


    }
}