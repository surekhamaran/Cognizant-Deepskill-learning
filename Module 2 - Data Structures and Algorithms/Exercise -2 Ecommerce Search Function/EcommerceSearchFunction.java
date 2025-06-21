import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class EcommerceSearchFunction {

    // Step 2: Product class
    static class Product {
        int productId;
        String productName;
        String category;

        Product(int id, String name, String category) {
            this.productId = id;
            this.productName = name;
            this.category = category;
        }

        @Override
        public String toString() {
            return "ID: " + productId + ", Name: " + productName + ", Category: " + category;
        }
    }

    // Step 3: Linear Search (by productName)
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }

    // Step 3: Binary Search (by productName)
    public static Product binarySearch(Product[] products, String targetName) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compare = products[mid].productName.compareToIgnoreCase(targetName);

            if (compare == 0) {
                return products[mid];
            } else if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    // Step 4: Analysis
    public static void compareSearches(Product[] products, String searchName) {
        System.out.println("\n--- Linear Search ---");
        long start1 = System.nanoTime();
        Product result1 = linearSearch(products, searchName);
        long end1 = System.nanoTime();
        System.out.println(result1 != null ? "Found: " + result1 : "Product not found.");
        System.out.println("Time: " + (end1 - start1) + " ns");

        // Sort before binary search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        System.out.println("\n--- Binary Search ---");
        long start2 = System.nanoTime();
        Product result2 = binarySearch(products, searchName);
        long end2 = System.nanoTime();
        System.out.println(result2 != null ? "Found: " + result2 : "Product not found.");
        System.out.println("Time: " + (end2 - start2) + " ns");
    }

    public static void main(String[] args) {
        // Sample products
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Footwear"),
            new Product(3, "Watch", "Accessories"),
            new Product(4, "Smartphone", "Electronics"),
            new Product(5, "Bag", "Travel")
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name to search: ");
        String searchName = sc.nextLine();

        compareSearches(products, searchName);
    }
}
