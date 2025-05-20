package Student;

public class Student {
    private int mark;
    private boolean passed;

    public Student(int mark){
        this.mark = mark;
        this.passed = (mark >= 50);
    }

    public void displayResult(int studentNumber){
        if(passed) {
            System.out.println("Student " + studentNumber + ": passed");
        } else {
            System.out.println("Student " + studentNumber + ": failed");
        }
    }
}
