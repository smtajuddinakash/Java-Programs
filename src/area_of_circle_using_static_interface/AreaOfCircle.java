package area_of_circle_using_static_interface;

import java.util.Scanner;

interface areaCel{
    public interface AreaCal {
        void circle();
    }
}


public class AreaOfCircle{

    double area;

    void circle(double r){
        area = Math.PI * r * r;
    }

    public static void main(String[] args) {
        AreaOfCircle x;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Circle Radius: ");
        double res = scanner.nextDouble();
        x=new AreaOfCircle();
        x.circle(res);
        System.out.printf("Area of Circle is: "+x.area);

    }
}
