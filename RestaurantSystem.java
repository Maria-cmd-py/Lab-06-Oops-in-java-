abstract class Order {
    protected String customerName;
    protected String item;
    public void setOrderDetails(String name, String item) {
        customerName = name;
        this.item = item;
    }
    public abstract double calculateBill();
}
class DineInOrder extends Order {
    @Override
    public double calculateBill() {
        double basePrice = 500; // Example price
        return basePrice + (basePrice * 0.1); // +10% service charge
    }
}
class DeliveryOrder extends Order {
    @Override
    public double calculateBill() {
        double basePrice = 500;
        return basePrice + 50; // +50 delivery fee
    }
}
public class RestaurantSystem {
    public static void main(String[] args) {
        Order dineIn = new DineInOrder();
        dineIn.setOrderDetails("Ali", "Burger");
        System.out.println("Dine-In Bill: Rs." + dineIn.calculateBill());
        Order delivery = new DeliveryOrder();
        delivery.setOrderDetails("Hina", "Pizza");
        System.out.println("Delivery Bill: Rs." + delivery.calculateBill());
    }
}