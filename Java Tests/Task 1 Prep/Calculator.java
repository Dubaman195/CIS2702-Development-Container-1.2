import java.util.Scanner;

// Initialise Calculator class
public class Calculator {

    public static class Counter {
        // Attributes
        private int count;

        // Constructor
        public Counter() {
            this.count = 0;
        } 

        // Methods
        public void increment() {
            this.count += 1;
        }

        public int getCount() {
            return this.count;
        }

        public void reset() {
            this.count = 0;
        }
    }

    // Necessary to run the calculator
    public static void main(String[] args) {
        // Declare and initialise the counter and scanner objects
        Counter counter = new Counter();
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        // Loop to keep the calculator running until the user decides to exit
        while (continueCalculating) {
            System.out.println("----Calculator----");
            System.out.println(" 1. Add");
            System.out.println(" 2. Subtract");
            System.out.println(" 3. Multiply");
            System.out.println(" 4. Divide");
            System.out.println(" 5. Exit");
            System.out.print("Select an operation (1-5): ");

            // Get user input for the operation choice
            int choice = scanner.nextInt();
            
            // Perform the selected operation based on user input
            if (choice == 1) {
                System.out.println("Enter first number: ");
                double num1 = scanner.nextDouble();

                System.out.println("Enter second number: ");
                double num2 = scanner.nextDouble();

                double result = num1 + num2;
                System.out.println("Result: " + result);

                counter.increment();
            } 
            else if (choice == 2) {
                System.out.println("Enter first number: ");
                double num1 = scanner.nextDouble();

                System.out.println("Enter second number: ");
                double num2 = scanner.nextDouble();

                double result = num1 - num2;
                System.out.println("Result: " + result);

                counter.increment();
            } 
            else if (choice == 3) {
                System.out.println("Enter first number: ");
                double num1 = scanner.nextDouble();

                System.out.println("Enter second number: ");
                double num2 = scanner.nextDouble();

                double result = num1 * num2;
                System.out.println("Result: " + result);

                counter.increment();
            } 
            else if (choice == 4) {
                System.out.println("Enter first number: ");
                double num1 = scanner.nextDouble();

                System.out.println("Enter second number: ");
                double num2 = scanner.nextDouble();

                if (num2 != 0) {
                    double result = num1 / num2;
                    System.out.println("Result: " + result);
                    counter.increment();
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
            } 
            else if (choice == 5) {
                continueCalculating = false;
            } 
            else {
                System.out.println("Invalid choice. Please select a valid operation.");
            }
        }
        // Display the total number of operations performed before exiting the calculator
        System.out.println("Total operations performed: " + counter.getCount());
    }
}