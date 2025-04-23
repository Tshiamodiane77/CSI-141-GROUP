public class Sorter {
    // Selection Sort
    public static void selectionSort(Product[] products)
     {
        for (int i = 0; i < products.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < products.length; j++) {
                if (products[j].getPrice() < products[minIndex].getPrice())
                 {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            Product temp = products[minIndex];
            products[minIndex] = products[i];
            products[i] = temp;
        }
    }

    // Insertion Sort
    public static void insertionSort(Product[] products) {
        for (int i = 1; i < products.length; i++) {
            Product key = products[i];
            int j = i - 1;
            while (j >= 0 && products[j].getPrice() > key.getPrice()) {
                products[j + 1] = products[j];
                j--;
            }
            products[j + 1] = key;
        }
    }
}