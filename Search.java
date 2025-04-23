public class Search
 {
    // Linear Search
    public static int linearSearch(Product[] products, String name)
     {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equalsIgnoreCase(name)) {
                return i; // Return the index of the found product
            }
        }
        return -1; // Not found
    }

    // Binary Search
    public static int binarySearch(Product[] products, double price)
     {
        int left = 0;
        int right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].getPrice() == price)
             {
                return mid; // Return the index of the found product
            }
            if (products[mid].getPrice() < price)
             {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Not found
    }
}