package ua.edu.ucu.apps.flowerstore;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import ua.edu.ucu.apps.flowerstore.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.flowerstore.payment.PayPalPaymentStrategy;
import ua.edu.ucu.apps.flowerstore.payment.Payment;

public class PaymentTest {
    @Test
    public void testPayPalPayment() {
        Payment payment = new PayPalPaymentStrategy();
        Assertions.assertEquals("Pay 2.0 UAH with PayPal", payment.pay(2));
    }

    @Test
    public void testCreditCardPayment() {
        Payment payment = new CreditCardPaymentStrategy();
        Assertions.assertEquals(
                "Pay 2.0 UAH with Credit card",
                payment.pay(2)
        );
    }
}
