
class DynamicBinding {
    // How dynamic binding works:
    // Reference type: Animal (what you declared)
    // Object type: Dog (what you actually created)
    // Method called: Determined by object type (Dog), not reference type
    // This is the essence of polymorphism!

    // Animal myAnimal = new Dog("Rex", 5, "Labrador");
    // myAnimal.makeSound(); // Calls Dog's makeSound(), not Animal's!

    public abstract class Shape {
        // Protected means it can only be used in this package and in SUBCLASSES
        protected String color;
        protected boolean filled;

        public Shape(String color, boolean filled) {
            this.color = color;
            this.filled = filled;
        }

        // Abstract methods - must be overridden
        public abstract double getArea();

        public abstract double getPerimeter();

        public abstract String getShapeType();

        public abstract void draw();

        // Concrete method using polymorphic behaviour
        public void displayInfo() {
            System.out.println("Shape Information:");
            System.out.println("  Type: " + getShapeType());
            System.out.println("  Color: " + color);
            System.out.println("  Filled: " + filled);
            System.out.println("  Area: " + String.format("%.2f", getArea()));
            System.out.println("  Perimeter: " + String.format("%.2f", getPerimeter()));
            draw();
        }

    }

    // Subclass / Childclass
    public class Circle extends Shape {
        private double radius;

        public Circle(String color, boolean filled, double radius) {
            // Constructor for creating an object using attributes from the superclass
            // (Shape)
            super(color, filled);
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }

        @Override
        public void draw() {
            System.out.println(" Drawing: Circle with radius " + radius);
        }

        @Override
        public String getShapeType() {
            return "Circle";
        }
    }

    // By overriding the methods it makes it possible for different objects from the same parent class
    // call the same name, making it easier to allow a method with a similar function to be used uniquely.
}
