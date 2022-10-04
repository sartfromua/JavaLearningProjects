import java.util.Scanner;
import java.lang.Math;

public class task_4_4 {
    static Scanner scan = new Scanner(System.in);

    public static double triange_perimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static double triange_area(double a, double b, double c) {
        double p = triange_perimeter(a, b ,c) / 2;
        return (double) Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }

    public static void main(String[] args) {
        /*
         * Place for ur scanner
         */
        double a = 3, b = 3.5 + 3* Math.pow(2,-111), c = b;
        System.out.printf("Triangle perimeter: %f\nTriange area: %f", triange_perimeter(a, b, c), triange_area(a, b, c));
    }
}
