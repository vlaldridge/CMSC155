package Week7.ipadExample;

public class iPad implements iPadType{
    private int memorySize;

    public iPad (int memorySize) {
        this.memorySize = memorySize;
    }

    public double computePrice() {
        return (5 * memorySize) ;
    }

    public String toString() {
        return "iPad has " + memorySize + "GB memory,  and costs $" + computePrice();
    }
}
