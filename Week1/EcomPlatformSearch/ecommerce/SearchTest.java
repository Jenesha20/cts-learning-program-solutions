package ecommerce;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(203, "Shoes", "Fashion"),
            new Product(150, "Smartphone", "Electronics"),
            new Product(305, "Backpack", "Accessories"),
            new Product(250, "Watch", "Fashion")
        };

        Product[] sortedProducts = {
            new Product(101, "Laptop", "Electronics"),
            new Product(150, "Smartphone", "Electronics"),
            new Product(203, "Shoes", "Fashion"),
            new Product(250, "Watch", "Fashion"),
            new Product(305, "Backpack", "Accessories")
        };

        Product result1 = SearchAlgorithms.linearSearch(products, 150);
        if (result1 != null) {
            System.out.println("Linear Search: Found " + result1.getProductName());
        } else {
            System.out.println("Linear Search: Product not found");
        }

        Product result2 = SearchAlgorithms.binarySearch(sortedProducts, 150);
        if (result2 != null) {
            System.out.println("Binary Search: Found " + result2.getProductName());
        } else {
            System.out.println("Binary Search: Product not found");
        }
    }
}
