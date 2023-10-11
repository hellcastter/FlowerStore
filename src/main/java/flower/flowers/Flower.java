package flower.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @Getter @NoArgsConstructor
public class Flower extends Item {
    public Flower(Flower flower) {
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
        this.flowerType = flower.flowerType;
    }

    @Setter
    private double price;
    private double sepalLength;
    @Setter
    private FlowerColor color;
    private FlowerType flowerType;
}
