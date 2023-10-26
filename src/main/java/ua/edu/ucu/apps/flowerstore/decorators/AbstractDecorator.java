package ua.edu.ucu.apps.flowerstore.decorators;

import ua.edu.ucu.apps.flowerstore.flowers.Item;

public abstract class AbstractDecorator extends Item {
    private int decoratorPrice;
    public abstract double getPrice();
}
