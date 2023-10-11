package flower.flowers;


import lombok.Getter;
import lombok.Setter;

@Getter
public class FlowerPack {
    @Setter
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower) {
        setQuantity(1);
        this.flower = new Flower(flower);
    }

    public FlowerPack(Flower flower, int quantity) {
        setQuantity(quantity);
        this.flower = new Flower(flower);
    }

    public double getPrice() {
        return quantity * flower.getPrice();
    }

    void setQuantity(int quantityOfFlowers) {
        this.quantity = quantityOfFlowers;

        if (this.quantity <= 1) {
            this.quantity = 1;
        }
    }
}