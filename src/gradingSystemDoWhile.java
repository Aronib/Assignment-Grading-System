
public class gradingSystemDoWhile extends Main{

    public gradingSystemDoWhile() {
        super();
    }

    public void gradeDoWhile(){
        i = 0;
        do {
            sum += grade[i];
            i++;
        }while(i<5);

        avg = sum / 5;
        System.out.println("Result using Do While: ");
        result(avg);
    }
}
