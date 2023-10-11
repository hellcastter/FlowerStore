package flower.flowers;


public enum FlowerColor {
    RED("#FF0000"),
    BLUE("#0000FF"),
    BLACK("#000000"),
    WHITE("#FFFFFF");

    public final String label;

    private FlowerColor(String label) {
        this.label = label;
    }

    @Override 
    public String toString() { 
        return this.label; 
    }
}
