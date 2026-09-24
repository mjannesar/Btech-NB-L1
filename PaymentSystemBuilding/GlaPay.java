package PaymentSystemBuilding;

public class GlaPay implements Payment{
    public void pay(double amount) {
        // ... oown logic
        System.out.println("Gla logic");
    }

    public void refund(double amount) {
        System.out.println("Refund logic");
    }
}
