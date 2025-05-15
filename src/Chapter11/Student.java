package Chapter11;

public class Student {
    private String name;
    private String grade;
    private int age;

    //default constructor
    public Student() {
        this.name = "unknown";
        this.grade = "unknown";
        this.age = 0;
    }

    //overloaded constructor
    public Student(String name, String grade, int age) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }
    //getter methods

    public String getName() {
        return this.name;
    }

    public String getGrade() {
        return this.grade;
    }

    public int getAge() {
        return age;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //display method
    public void displayInfo(){
        System.out.println("Student name : +this.name");
        System.out.println("Student Grade : +this.grade");
        System.out.println("Student Age : +this.age");
    }

}
