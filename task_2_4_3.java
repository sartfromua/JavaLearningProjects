package HW_4;
import java.lang.Math;

public class task_2_4_3 {
    public static double Rosenbrock2d(double x, double y) {
        return Math.pow(x*x - y, 2) * 100 + Math.pow(x - 1, 2);
    }

    public static void main(String[] args) {
        double[] x = {1, 10.1, -1.2}, y = {6, 100.7, 15};
        for (int i=0; i<x.length; i++) {
            System.out.println(Rosenbrock2d(x[i], y[i]));
        }
    }
}
