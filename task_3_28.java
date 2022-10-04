import java.util.Scanner;
import java.lang.Math;

public class task_3_28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите внешний радиус: ");
        double inner_r = in.nextDouble();
        System.out.println("Введите внутрешний радиус: ");
        double outer_r = in.nextDouble();
        double volume = 2 * Math.pow(Math.PI,2) * Math.pow(inner_r,2) * outer_r;
        System.out.printf("Volume = %f", volume);
    }
}
