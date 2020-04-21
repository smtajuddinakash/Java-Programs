package area_of_circle_using_static_inheritance;

import java.text.DecimalFormat;

public class CirculeCalculation {
    double area;

    double circle(double r){
        area = Math.PI * r * r;

        DecimalFormat format = new DecimalFormat("0.00");
        return area;

    }
}
