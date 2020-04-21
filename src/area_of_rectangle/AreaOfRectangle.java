package area_of_rectangle;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter The Length: ");
        double l = s.nextDouble();
        System.out.print("Enter the breadth: ");
        double b =s.nextDouble();
        double res = l*b;
        System.out.print("Area of Triangle is: "+res);
    }
}
