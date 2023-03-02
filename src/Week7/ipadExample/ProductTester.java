package Week7.ipadExample;

public class ProductTester {
    public static void main(String[] args)  {
        Product bigPro = new Product(new iPadPro129(256));
        Product pro = new Product (new iPadPro11(52));
        Product iPad = new Product(new iPad(32));



        System.out.println(bigPro + "\n" + pro + "\n" +
                iPad + "\n" );
    }

}
