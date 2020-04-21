package area_of_triangle_simple;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Width of Triangle: ");
        double w = scanner.nextDouble();
        System.out.print("Enter Height of Triangle: ");
        double h = scanner.nextDouble();

        double area = (w*h)/2;
        System.out.print("Area of your triangle: "+area);
    }
}
