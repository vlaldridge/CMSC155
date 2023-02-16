package Week3;

public class CylinderTester {
    public static void main(String[] args) {
        Circle circ1 = new Circle(3);
        Cylinder cyl1 = new Cylinder(circ1,5);
        System.out.println(circ1);
        System.out.println(circ1.calcArea());
        System.out.println(cyl1);
        System.out.println(cyl1.calcVol());
    }
}
