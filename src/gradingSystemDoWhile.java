import java.util.Scanner;
public class gradingSystemDoWhile extends Main{
    Scanner scan = new Scanner(System.in);
    public void gradeWhile(Float sum, Float avg, Float[] grade,  int i){

        do {
            grade[i] = scan.nextFloat();
            sum += grade[i];
        }while(i<5);

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
