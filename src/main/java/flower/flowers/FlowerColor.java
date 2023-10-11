package flower.flowers;

import lombok.Getter;

public enum FlowerColor {
    RED("#FF0000"),
    BLUE("#0000FF"),
    BLACK("#000000"),
    WHITE("#FFFFFF");

    @Getter
    final String label;

    FlowerColor(String label) {
        this.label = label;
    }

    @Override 
    public String toString() { 
        return this.label; 
    }
}
