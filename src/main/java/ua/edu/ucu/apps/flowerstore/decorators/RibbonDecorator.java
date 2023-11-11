package ua.edu.ucu.apps.flowerstore.decorators;

import ua.edu.ucu.apps.flowerstore.flowers.Item;

public class RibbonDecorator extends AbstractDecorator {

    public RibbonDecorator(Item item) {
        super(item);
    }


    @Override
    public double getPrice() {
        int decoratorPrice = 40;
        return decoratorPrice + super.getPrice();
    }
}
