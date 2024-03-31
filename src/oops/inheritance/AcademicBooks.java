package oops.inheritance;

 public class AcademicBooks extends Book {

     public void displayInfo(String title, String author, int numberOfPages) {
         System.out.println("Title: " + title);
         System.out.println("Author: " + author);
         System.out.println("Number of Pages: " + numberOfPages + "\n");
     }
 }
