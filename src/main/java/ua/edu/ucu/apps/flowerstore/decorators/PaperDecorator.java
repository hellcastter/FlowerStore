package ua.edu.ucu.apps.flowerstore.decorators;

import ua.edu.ucu.apps.flowerstore.flowers.Item;

public class PaperDecorator extends AbstractDecorator {
    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        int decoratorPrice = 13;
        return decoratorPrice + super.getPrice();
    }
}
