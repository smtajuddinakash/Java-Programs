package area_of_circle_using_static_method;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double r, sum;

        System.out.print("Enter Radius of Circle: ");
        r = scanner.nextDouble();
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        sum = Math.PI * r * r;

        System.out.print("Area Of Circle is: "+decimalFormat.format(sum));



    }
}
