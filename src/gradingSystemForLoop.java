public class gradingSystemForLoop extends Main{
    public gradingSystemForLoop() {
        super();
    }

    public void gradingForLoop(){
        for ( i = 0; i < 5; i++) {
        sum += grade[i];
    }

    avg = sum / 5;
        System.out.println("Result using For Loop: ");
        result(avg);
}
}
