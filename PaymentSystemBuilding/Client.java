package PaymentSystemBuilding;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for GooglePay, 2 for GlaPay");
        int choice = sc.nextInt();
        Payment client;
        if(choice == 1) {
            client = new GooglePay();
        } else {
            client = new GlaPay();
        }

        client.pay(100);
        client.refund(200);
    }
}
