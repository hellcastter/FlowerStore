package ua.edu.ucu.apps.flowerstore.decorators;

import lombok.AllArgsConstructor;
import ua.edu.ucu.apps.flowerstore.flowers.Item;

@AllArgsConstructor
public class PaperDecorator extends AbstractDecorator {
    private final Item item;
    @Override
    public double getPrice() {
        return 13 + item.getPrice();
    }
}
