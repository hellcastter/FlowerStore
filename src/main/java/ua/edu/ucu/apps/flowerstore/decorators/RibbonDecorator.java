package ua.edu.ucu.apps.flowerstore.decorators;

import ua.edu.ucu.apps.flowerstore.flowers.Item;

public class RibbonDecorator extends AbstractDecorator {
    private final int decoratorPrice = 40;

    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return decoratorPrice + super.getPrice();
    }
}
