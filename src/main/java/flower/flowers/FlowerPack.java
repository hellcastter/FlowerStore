package flower.flowers;


import lombok.Getter;
import lombok.Setter;

@Getter
public class FlowerPack {
    @Setter
    private Flower flower;
    private int quantity;

    public double getPrice() {
        return quantity * flower.getPrice();
    }

    void setQuantity(int quantity) {
        this.quantity = quantity < 1 ? 1 : quantity;
    }

    public FlowerPack(Flower flower) {
        setQuantity(1);
        this.flower = new Flower(flower);
    }

    public FlowerPack(Flower flower, int quantity) {
        setQuantity(quantity);
        this.flower = new Flower(flower);
    }
}