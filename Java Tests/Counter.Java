public class Counter{
    private int count;

    public Counter(){
        this.count = 0;
    }

    public void increment(){
        this.count += 1;
    }

    public int getCount(){
        return count;
    }

    public void reset(){
        this.count = 0;
    }

    public static void main(String[] args){
        Counter counter1 = new Counter();
        Counter counter2 = counter1;  // Both point to same object
        counter1.increment();
        System.out.println(counter2.getCount()); // Should print 1
    }
}
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

