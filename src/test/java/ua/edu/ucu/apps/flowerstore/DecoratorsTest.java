package ua.edu.ucu.apps.flowerstore;

import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.flowerstore.decorators.PaperDecorator;
import ua.edu.ucu.apps.flowerstore.decorators.RibbonDecorator;
import ua.edu.ucu.apps.flowerstore.flowers.Flower;
import ua.edu.ucu.apps.flowerstore.flowers.FlowerBucket;
import ua.edu.ucu.apps.flowerstore.flowers.FlowerPack;

import org.junit.jupiter.api.Assertions;
import ua.edu.ucu.apps.flowerstore.flowers.Item;

public class DecoratorsTest {
    @Test
    public void testPrice() {
        int price = 60;
        int quantity = 10;

        Flower flower = new Flower();
        flower.setPrice(price);

        FlowerBucket fb = new FlowerBucket();

        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        fb.add(flowerPack);

        Item item = fb;
        item = new RibbonDecorator(item);
        item = new PaperDecorator(item);

        Assertions.assertEquals(653, item.getPrice());
    }
}
