package HW_7;

public class Circle extends Circumference{

    public double getArea() {
        return Math.PI * radius*radius;
    }

    public boolean equalsTo(Circle other) {
        return Math.abs(radius - other.radius) < 0.000001;
    }

    public boolean hasSameCords(Circle other) {
        return (x == other.x) && (y == other.y);
    }

    public boolean intersectsWith(Circle other) {
        return lengthTo(other) < (radius+other.radius);
    }

    public boolean hasPoint(Point p) {
        return lengthTo(p) <= radius;
    }
}
