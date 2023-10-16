package ua.edu.ucu.apps.flowerstore.flowers;

import lombok.Getter;

public abstract class Item {
    @Getter
    private String description;
    public abstract double getPrice();
}
