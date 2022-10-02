import java.util.Scanner;
import java.lang.Math;

public class task_2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 числа: ");
        String line = in.nextLine();
        String[] numbers = line.split("\\s");
        double n1 = Double.parseDouble(numbers[0]), n2 = Double.parseDouble(numbers[1]);
        double aver_geom = Math.sqrt(n1*n2);
        System.out.printf("Geometric average: %e or %f", aver_geom, aver_geom);
    }
}
