package ua.edu.ucu.apps.flowerstore.decorators;

import ua.edu.ucu.apps.flowerstore.flowers.Item;

public class BasketDecorator extends AbstractDecorator {
    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        int decoratorPrice = 4;
        return decoratorPrice + super.getPrice();
    }
}
