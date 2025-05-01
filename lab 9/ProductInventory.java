import java.util.HashMap;

public class ProductInventory {
    public static void main(String[] args) {
        HashMap<Integer, Integer> inventory = new HashMap<>();

        // Add products
        inventory.put(1001, 50);
        inventory.put(1002, 30);
        inventory.put(1003, 70);

        // Update quantity of product 1002
        inventory.put(1002, 45);

        // Remove product 1001
        inventory.remove(1001);

        // Display final inventory
        System.out.println("Final Inventory:");
        for (Integer id : inventory.keySet()) {
            System.out.println("Product ID: " + id + ", Quantity: " + inventory.get(id));
        }
    }
}
