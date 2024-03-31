package oops.inheritance;

public class Book {
    public String subject = "Introduction to Computer Science";

    public Book( ){

        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }


    public void provideInformation() {
        System.out.println("This academic book is about the subject: " + subject);
        System.out.println("It provides factual information and analysis.");
    }



}
