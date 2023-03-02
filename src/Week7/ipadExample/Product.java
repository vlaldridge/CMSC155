package Week7.ipadExample;

public class Product {
    private iPadType type;

    public Product(iPadType type) {
        this.type = type;
    }

    public double computePrice() {
    return type.computePrice();
    }


    public String toString() {
        return type + " has " + computePrice();
    }

}
