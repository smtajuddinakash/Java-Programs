package area_of_circle_using_static_constractor;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Radius of Circle: ");
        double res = scanner.nextDouble();
        AreaCal areaCal = new AreaCal(res);
        System.out.print("Area of circle: "+areaCal.area);
    }
}
