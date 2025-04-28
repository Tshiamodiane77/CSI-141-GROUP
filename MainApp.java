public class MainApp 
{
    public static void main(String[] args)
     {
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
        }
    }
}
