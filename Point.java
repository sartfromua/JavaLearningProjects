package CW_HW_4;

import java.lang.Math;

public class Point {
    double x, y, z;

    double distance(Point p) {
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2) + Math.pow(z - p.z, 2));
    }

    public String toString() {
        return "(" + Double.toString(x) + ", " + Double.toString(y)+ ", " + Double.toString(z) + ")";
    }

    Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Point() {}
}
