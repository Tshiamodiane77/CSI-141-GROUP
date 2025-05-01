public class MainApp {
    public static void main(String[] args) {
        try {
            // Sample products
            Product[] products = new Product[5];
            products[0] = new Product("Flour", 150.00, 12);
            products[1] = new Product("Rice", 200.00, 10);
            products[2] = new Product("Macaroni", 45.50, 3);
            products[3] = new Product("Maize meal", 100.99, 13);
            products[4] = new Product("Braii pack", 198.90, 5);

            // Create a customer
            Customer customer = new Customer("Ame Botshelo", "amebotshelo@gmail.com");

            // Display customer information
            System.out.println("Customer: " + customer.getName() + ", Email: " + customer.getEmail());

            // Display products before sorting
            System.out.println("\nProducts before sorting:");
            for (Product product : products) {
                System.out.println(product.getName() + ": P" + product.getPrice());
            }
            //Sort products by price using Selection Sort
            Sorter.selectionSort(products);

            // Display products after sorting
            System.out.println("\nProducts after sorting by price (Selection Sort):");
            for (Product product : products) {
                System.out.println(product.getName() + ": P" + product.getPrice());
            }
             // Perform a linear search
            String searchName = "Maizemeal";
            int index = Search.linearSearch(products, searchName);
            if (index != -1) {
                System.out.println("\nFound " + searchName + " at index: " + index);
            } else {
                System.out.println("\n" + searchName + " not found.");
            }
            
           // Perform a binary search(after sorting)
            double searchPrice = 200.00;
            index = Search.binarySearch(products, searchPrice);
            if(index != -1) {
                System.out.println("Found product with price P" + searchPrice + " at index: " + index);
            } else {
                System.out.println("Product with price P" + searchPrice + " not found.");
            }
        }catch(InvalidPriceException e) {
            System.out.println("Error: " + e.getMessage());
            }
        }
    }
                
                
