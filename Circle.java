import java.util.Scanner;

public class Circle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        final double PI = 3.14159; 
        double circumference = 2 * PI * radius;
        double area = PI * radius * radius;

        System.out.println("The area of the circle is: " + area);
    }
}
