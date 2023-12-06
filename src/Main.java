import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float[] grade = new float[5];

        float sum = 0, avg;

        System.out.println("Please enter your points for 5 subjects:");

        for (int i = 0; i < 5; i++) {
            grade[i] = scan.nextFloat();
            sum += grade[i];
        }

        avg = sum / 5;

        if (avg >= 95 && avg <= 100) {
            System.out.println("A");
        } else if (avg >= 90 && avg < 95) {
            System.out.println("A-");
        } else if (avg >= 85 && avg < 90) {
            System.out.println("B+");
        } else if (avg >= 80 && avg < 85) {
            System.out.println("B");
        } else if (avg >= 75 && avg < 80) {
            System.out.println("B-");
        } else if (avg >= 70 && avg < 75) {
            System.out.println("C+");
        } else if (avg >= 65 && avg < 70) {
            System.out.println("C");
        } else if (avg >= 60 && avg < 65) {
            System.out.println("C-");
        } else if (avg >= 55 && avg < 60) {
            System.out.println("D+");
        } else if (avg >= 50 && avg < 55) {
            System.out.println("D");
        } else if (avg < 55) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid Marks Entered");
        }


    }
}