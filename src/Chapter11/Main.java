package Chapter11;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("Using Default Constructor:");
        student1.displayInfo();

        student1.setName("Ravindu");
        student1.setAge(26);
        student1.setGrade("Grade 8");
        System.out.println("\nAfter setting values with setters:");
        student1.displayInfo();

        // Using overloaded constructor
        Student student2 = new Student("Nimal", "Grade 11" , 17);
        System.out.println("\nUsing Overloaded Constructor:");
        student2.displayInfo();

        // Accessing individual values using getters
        System.out.println("\nAccessing using getters:");
        System.out.println("Name: " + student2.getName());
        System.out.println("Age: " + student2.getAge());
        System.out.println("Grade: " + student2.getGrade());

    }

}
