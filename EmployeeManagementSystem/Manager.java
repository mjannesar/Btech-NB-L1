package EmployeeManagementSystem;

public class Manager extends Person{
    String post;
    Manager(String name, double salary, String post) {
        super(name, salary);
        this.post = post;
    }

    public void work() {
        System.out.println(name+" is working");
    }
}
