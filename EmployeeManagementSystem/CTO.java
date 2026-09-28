package EmployeeManagementSystem;

public class CTO extends Person{
    boolean isStock;
    CTO(String name, double salary, boolean isStock) {
        super(name, salary);
        this.isStock = isStock;
    }

    public void login() {
        System.out.println(name+" can come anytime");
    }

    public void Logout() {
        System.out.println(name+" can go anytime");
    }

    public void work() {
        System.out.println(name+" right now in meeting");
    }
}
