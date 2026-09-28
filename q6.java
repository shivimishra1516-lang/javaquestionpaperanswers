import java.util.ArrayList;

class ProductDetails {

    int productId;
    String productName;
    int price;

    // Constructor
    ProductDetails(int productId, String productName, int price) {

        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
}

public class q6 {

    public static void main(String[] args) {

        ProductDetails p1 =
            new ProductDetails(1, "Soap", 100);

        ProductDetails p2 =
            new ProductDetails(2, "Gel", 300);

        ProductDetails p3 =
            new ProductDetails(3, "Shampoo", 400);

        // Create ArrayList
        ArrayList<ProductDetails> products =
            new ArrayList<>();

        // Add products
        products.add(p1);
        products.add(p2);
        products.add(p3);

        // Display all products
        System.out.println("All Products:");

        for (ProductDetails p : products) {

            System.out.println(
                p.productId + " " +
                p.productName + " " +
                p.price
            );
        }

        // Remove one product
        products.remove(p2);

        // Display updated list
        System.out.println("Updated List:");

        for (ProductDetails p : products) {

            System.out.println(
                p.productId + " " +
                p.productName + " " +
                p.price
            );
        }
    }
}