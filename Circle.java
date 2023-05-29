import java.util.Scanner;

public class Circle {
    private double radius;
    private double area;
    private double circumference;
    private final double PI = 3.14159;

    public void setRadius(double radius) {
        this.radius = radius;
        calculateArea();
        calculateCircumference();
    }

    private void calculateArea() {
        area = PI * radius * radius;
    }

    private void calculateCircumference() {
        circumference = 2 * PI * radius;
    }

    public void displayArea() {
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle();
        circle.setRadius(radius);
        circle.displayArea();

        scanner.close();
    }
}
