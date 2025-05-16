package Constructor;

public class Person {
    String name;
    int age;


    public Person( String n, int a){
        name = n;
        age =a;
    }
    public void displayInfo(){
        System.out.println("name :" +name);
        System.out.println("Age :" +age);
    }

}
