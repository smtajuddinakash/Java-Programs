package area_of_circle_using_method;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Radius of Circle: ");
        double res = scanner.nextDouble();
        double a = area(res);
        System.out.print("Area of circle is: "+a);

    }
    static double area(double r){
        return Math.PI * r *r ;
    }
}
