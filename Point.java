package HW_7;

import java.util.Scanner;

public class Point {
    int x, y;
    static Scanner scan = new Scanner(System.in);

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {}

    public double lengthTo(Point other) {
        return Math.sqrt(Math.pow(x-other.x, 2) + Math.pow(y-other.y, 2));
    }

    public void input() {
        System.out.print("x = ");
        x = scan.nextInt();
        System.out.print("y = ");
        y = scan.nextInt();
    }

    @Override
    public String toString() {
        return "("+x+"; "+y+")";
    }
}
