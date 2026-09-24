package FoodManagement;

public class Burger extends FoodItem implements Deliverable{
    public void calculateBill() {
        System.out.println("This is the Burger bill");
    }

    public void deliver() {
        System.out.println("Burger is going to be delivered");
    }
}
