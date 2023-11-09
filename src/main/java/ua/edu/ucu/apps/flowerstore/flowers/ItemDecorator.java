package ua.edu.ucu.apps.flowerstore.flowers;

public abstract class ItemDecorator extends Item {
    private Item item;

    public ItemDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice();
    }
}
