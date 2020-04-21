package area_of_circle_using_static_inheritance;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleArea extends CirculeCalculation{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter Radius of Circle:  ");
        double res = scanner.nextDouble();

        CircleArea c = new CircleArea();
        c.circle(res);

        DecimalFormat format = new DecimalFormat("0.00");
        System.out.print("Area of Circle: "+format.format(c.area));
    }

}
