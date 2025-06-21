import java.util.HashMap;
import java.util.Scanner;

public class InventoryManagementSystem {

    // Step 3: Product class
    static class Product {
        int productId;
        String productName;
        int quantity;
        double price;

        public Product(int productId, String productName, int quantity, double price) {
            this.productId = productId;
            this.productName = productName;
            this.quantity = quantity;
            this.price = price;
        }

        @Override
        public String toString() {
            return "ID: " + productId + ", Name: " + productName + ", Qty: " + quantity + ", Price: ₹" + price;
        }
    }

    // Inventory storage using HashMap
    static HashMap<Integer, Product> inventory = new HashMap<>();

    // Add a product
    public static void addProduct(Product product) {
        inventory.put(product.productId, product);
        System.out.println("Product added successfully.");
    }

    // Update product details
    public static void updateProduct(int productId, String name, int qty, double price) {
        if (inventory.containsKey(productId)) {
            Product p = inventory.get(productId);
            p.productName = name;
            p.quantity = qty;
            p.price = price;
            System.out.println("Product updated.");
        } else {
            System.out.println("Product not found.");
        }
    }

    // Delete a product
    public static void deleteProduct(int productId) {
        if (inventory.remove(productId) != null) {
            System.out.println("Product deleted.");
        } else {
            System.out.println("Product not found.");
        }
    }

    // Display inventory
    public static void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Current Inventory:");
            for (Product p : inventory.values()) {
                System.out.println(p);
            }
        }
    }

    // Main method to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Inventory Menu ---");
            System.out.println("1. Add Product\n2. Update Product\n3. Delete Product\n4. View Inventory\n5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    addProduct(new Product(id, name, qty, price));
                    break;
                case 2:
                    System.out.print("Enter ID to update: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter New Quantity: ");
                    qty = sc.nextInt();
                    System.out.print("Enter New Price: ");
                    price = sc.nextDouble();
                    updateProduct(id, name, qty, price);
                    break;
                case 3:
                    System.out.print("Enter ID to delete: ");
                    id = sc.nextInt();
                    deleteProduct(id);
                    break;
                case 4:
                    displayInventory();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
