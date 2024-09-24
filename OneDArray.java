import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {
        // Create a scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the size of the array
        System.out.print("Enter the number of elements you want to store: ");
        int size = scanner.nextInt();
        
        // Declare a 1D array of integers with the specified size
        int[] numbers = new int[size];
        
        // Input values into the array
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();  // Store each value in the array
        }
        
        // Output the array elements
        System.out.println("You entered:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        
        // Close the scanner
        scanner.close();
    }
}
