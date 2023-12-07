
public class gradingSystemWhile extends Main {

    public gradingSystemWhile() {
        super();
    }

    public void gradeWhile(){
        i=0;
        while (i < 5) {
            sum += grade[i];
            i++;
        }
        avg = sum / 5;
        System.out.println("Result using While: ");
        result(avg);
    }
}

