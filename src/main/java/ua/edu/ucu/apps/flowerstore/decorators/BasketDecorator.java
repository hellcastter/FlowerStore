package ua.edu.ucu.apps.flowerstore.decorators;

import ua.edu.ucu.apps.flowerstore.flowers.Item;

public class BasketDecorator extends AbstractDecorator {
    private final int decoratorPrice = 4;

    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return decoratorPrice + super.getPrice();
    }
}
