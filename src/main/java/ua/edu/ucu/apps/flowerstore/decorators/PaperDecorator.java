package ua.edu.ucu.apps.flowerstore.decorators;

import lombok.AllArgsConstructor;
import ua.edu.ucu.apps.flowerstore.flowers.Item;

@AllArgsConstructor
public class PaperDecorator extends AbstractDecorator {
    private final Item item;
    private final int decoratorPrice = 13;

    @Override
    public double getPrice() {
        return decoratorPrice + item.getPrice();
    }
}
