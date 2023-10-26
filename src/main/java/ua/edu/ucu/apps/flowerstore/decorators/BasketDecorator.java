package ua.edu.ucu.apps.flowerstore.decorators;

import lombok.AllArgsConstructor;
import ua.edu.ucu.apps.flowerstore.flowers.Item;

@AllArgsConstructor
public class BasketDecorator extends AbstractDecorator {
    private final Item item;

    @Override
    public double getPrice() {
        return 4 + item.getPrice();
    }
}
