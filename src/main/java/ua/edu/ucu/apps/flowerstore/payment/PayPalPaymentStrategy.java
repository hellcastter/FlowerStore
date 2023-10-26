package ua.edu.ucu.apps.flowerstore.payment;

public class PayPalPaymentStrategy implements Payment {

    @Override
    public String pay(double price) {
        return "Pay " + price + " UAH with PayPal";
    }
}
