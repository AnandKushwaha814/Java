import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int choice;

        // Input five numbers
        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; ++i) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Display menu
        System.out.println("\nMenu:");
        System.out.println("1. Find the smallest number");
        System.out.println("2. Find the largest number");
        System.out.println("3. Find the sum of all numbers");
        System.out.println("4. Find the average of all numbers");
        System.out.print("Enter your choice (1-4): ");
        choice = scanner.nextInt();

        // Perform the chosen operation using switch case
        switch (choice) {
            case 1: {
                int smallest = numbers[0];
                for (int i = 1; i < 5; ++i) {
                    if (numbers[i] < smallest) {
                        smallest = numbers[i];
                    }
                }
                System.out.println("Smallest number: " + smallest);
                break;
            }
            case 2: {
                int largest = numbers[0];
                for (int i = 1; i < 5; ++i) {
                    if (numbers[i] > largest) {
                        largest = numbers[i];
                    }
                }
                System.out.println("Largest number: " + largest);
                break;
            }
            case 3: {
                int sum = 0;
                for (int i = 0; i < 5; ++i) {
                    sum += numbers[i];
                }
                System.out.println("Sum of all numbers: " + sum);
                break;
            }
            case 4: {
                double average = 0.0;
                int sum = 0;
                for (int i = 0; i < 5; ++i) {
                    sum += numbers[i];
                }
                average = (double) sum / 5;
                System.out.println("Average of all numbers: " + average);
                break;
            }
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
        }

        scanner.close();
    }
}
