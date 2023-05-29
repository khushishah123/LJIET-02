import java.util.Scanner;

public class Circle {
    final double PI = 3.14; 
    double radius;
    double area;
    double circumference;
    public void setRadius() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
        radius = sc.nextDouble();
    }
    
    public void getData() {
        area = PI * radius * radius;
        circumference = 2 * PI * radius;
        System.out.println("Circumference : " + circumference);
        System.out.println("Area : " + area);
    }
    
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius();
        c1.getData();
    }
}
