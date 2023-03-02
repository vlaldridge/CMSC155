package Week7.ipadExample;

public class iPadPro129 implements iPadType{

    private int memorySize;

    public iPadPro129 (int memorySize) {
        this.memorySize = memorySize;
    }

    public double computePrice() {
        return (8 * memorySize) ;
    }

    public String toString() {
        return "iPad Pro 12.9 has " + memorySize + "GB memory,  and costs $" + computePrice();
    }
}
