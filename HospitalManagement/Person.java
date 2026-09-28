package HospitalManagement;

public abstract class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void displayRole();

    public void displayInfo() {
        System.out.println("Information of the Person: ");
        System.out.println("Name of the person:- "+name);
        System.out.println("Age of the person:- "+age);
    }
}
