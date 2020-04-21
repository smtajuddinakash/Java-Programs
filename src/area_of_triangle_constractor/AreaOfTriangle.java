package area_of_triangle_constractor;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the width of triangle: ");
        long b = s.nextLong();
        System.out.print("Enter the height of triangle: ");
        long h = s.nextLong();

        AreaCal areaCal = new AreaCal(b,h);
        System.out.print("Area of your triangle is: "+areaCal.area);

    }
}
