package Week3;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calcVol() {

        return base.calcArea() * height;
    }

    public String toString() {
        return "Cylinder with height " + height + " and base " + base + " ";
    }

}
