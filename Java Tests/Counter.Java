import java.util.Scanner;

public class Main {

    // 1. Counter Class
    public static class Counter {
        private int count;

        public Counter() {
            this.count = 0;
        }

        public void increment() {
            this.count += 1;
        }

        public int getCount() {
            return count;
        }

        public void reset() {
            this.count = 0;
        }
    }

    // Main entry point for execution
    public static void main(String[] args) {
        // Counter demonstration
        Counter counter1 = new Counter();
        Counter counter2 = counter1;  // Both point to the same object reference
        counter1.increment();
        System.out.println("Counter 2 value: " + counter2.getCount()); // Output: 1

        System.out.println("\n--- Rectangle Perimeter Calculator ---");

        // Single Scanner instance for user input
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.print("Enter rectangle length: ");
            double length = scanner.nextDouble();

            System.out.print("Enter rectangle width: ");
            double width = scanner.nextDouble();

            double perimeter = (length + width) * 2;
            System.out.println("The perimeter of the rectangle is: " + perimeter);

            System.out.print("Do you want to calculate another perimeter? (yes/no): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("no")) {
                continueCalculating = false;
            }
        }

        scanner.close();
        System.out.println("Program exited successfully.");
    }
}