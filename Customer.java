// 2nd domain class:Customer.java
public class Customer {
    private String name; // Name of the customer
    private String email; // Email of the customer

    // Constructor
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //Printing Method
    @Override
    public String toString() {
        return "Customer{name='" + name + "', email='" + email + "'}";
    }
}