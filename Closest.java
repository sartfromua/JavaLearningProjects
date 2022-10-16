package CW_HW_4;

import java.util.Scanner;
import CW_HW_4.Point;

public class Closest {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // Да это излишне, но захотелось пропробовать сделать так, работает же ;)
        // Как правильно задать комманду в консоли, чтобы запустить код, я не понял, но в проекте IDE работает
        Point p0 = new Point(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]));
        System.out.println("How many points?");
        int n = scan.nextInt();
        Point[] points = new Point[n];
        double x, y, z, closest_dist = Integer.MAX_VALUE;
        int closest_point_n = 0;
        for (int i = 0; i<n; i++) {
            System.out.print("(x, y, z) = ");
            x = scan.nextDouble();
            y = scan.nextDouble();
            z = scan.nextDouble();
            points[i] = new Point(x, y, z);

            double dist = p0.distance(points[i]);
            if (dist < closest_dist) {
                closest_dist = dist;
                closest_point_n = i;
            }
        }
        System.out.printf("Closest point: %s", points[closest_point_n].toString());
    }
}
