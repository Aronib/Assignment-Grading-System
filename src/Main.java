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

    }
}