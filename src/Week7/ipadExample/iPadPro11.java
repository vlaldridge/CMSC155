package Week7.ipadExample;

public class iPadPro11 implements iPadType{
    private int memorySize;

    public iPadPro11 (int memorySize) {
        this.memorySize = memorySize;
    }

    public double computePrice() {
        return (7 * memorySize) ;
    }

    public String toString() {
        return "iPad Pro 11 has " + memorySize + "GB memory,  and costs $" + computePrice();
    }
}
