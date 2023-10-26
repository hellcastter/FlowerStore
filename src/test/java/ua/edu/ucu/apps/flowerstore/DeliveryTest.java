package ua.edu.ucu.apps.flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import ua.edu.ucu.apps.flowerstore.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.flowerstore.delivery.Delivery;
import ua.edu.ucu.apps.flowerstore.delivery.PostDeliveryStrategy;
import ua.edu.ucu.apps.flowerstore.flowers.Flower;
import ua.edu.ucu.apps.flowerstore.flowers.FlowerColor;
import ua.edu.ucu.apps.flowerstore.flowers.FlowerType;
import ua.edu.ucu.apps.flowerstore.flowers.Item;

import java.util.LinkedList;
import java.util.List;

public class DeliveryTest {
    private List<Item> items;

    @BeforeEach
    public void init() {
        items = new LinkedList<Item>();
        items.add(new Flower(1, 80, 10, FlowerColor.RED, FlowerType.ROSE, "Red Rose"));
        items.add(new Flower(2, 50, 10, FlowerColor.WHITE, FlowerType.TULIP, "White Tulip"));
    }

    @Test
    public void testDHLDelivery() {
        Delivery delivery = new DHLDeliveryStrategy();
        Assertions.assertEquals("DHL delivery of 2 items", delivery.deliver(items));
    }

    @Test
    public void testPostDelivery() {
        Delivery delivery = new PostDeliveryStrategy();
        Assertions.assertEquals("Post delivering of 2 items", delivery.deliver(items));
    }
}
