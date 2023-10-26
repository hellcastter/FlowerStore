package ua.edu.ucu.apps.flowerstore.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ua.edu.ucu.apps.flowerstore.delivery.Delivery;
import ua.edu.ucu.apps.flowerstore.flowers.Item;
import ua.edu.ucu.apps.flowerstore.payment.Payment;

import java.util.List;

@AllArgsConstructor
public class Order {
    private List<Item> items;
    private Payment payment;
    private Delivery delivery;
    @Getter
    private double price;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    void calculateTotalPrice() {
        double price = 0;

        for (Item item : items) {
            price += item.getPrice();
        }

        this.price = price;
    }

    void addItem(Item item) {
        items.add(item);
        calculateTotalPrice();
    }

    void removeItem(Item item) {
        items.remove(item);
        calculateTotalPrice();
    }

    void processOrder() {
        System.out.printf("You have ordered %d items\n", items.size());
        System.out.printf("You have chosen %s payment strategy", payment.getClass().getSimpleName());
        System.out.printf("You have chosen %s delivery strategy", delivery.getClass().getSimpleName());
        System.out.printf("Total price %f UAH", price);
    }
}
