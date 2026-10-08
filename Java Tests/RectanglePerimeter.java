import java.util.Scanner;

public class RectanglePerimeter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter rectangle length: ");
        double length = scanner.nextDouble();

        System.out.println("Enter rectangle width: ");
        double width = scanner.nextDouble();

        double perimeter = (length + width) * 2;

        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
}