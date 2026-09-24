package PaymentSystemBuilding;

/**
 * Payment
 */
public interface Payment {
    void pay(double amount);
    void refund(double amount);
}