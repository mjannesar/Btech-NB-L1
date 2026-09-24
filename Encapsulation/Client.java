package Encapsulation;

public class Client {
    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount(11, 2000);
        // obj1.accNumber = 30;
        // obj1.balance = -5000;
        // System.out.println(obj1.accNumber+"  "+obj1.balance);
        // obj1.deposit(5000);
        
        System.out.println(obj1.getBalance());
    }
}
