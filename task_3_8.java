import java.util.Scanner;
import java.lang.Math;

public class task_3_8 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        double x = scan.nextDouble(), epsilon = 0.000001;
        double whole_part1 = (int) x, decimal_part1 = x - whole_part1;
        double decimal_part2 = x % 1, whole_part2 = x - decimal_part2;
        double max_lesser1 = (int) (((double) x) - epsilon), min_greater1 = (int) x+1;
        double max_lesser2 = Math.floor((((double) x) - epsilon));
        double min_greater2 = Math.ceil((((double) x) + epsilon));
        double rounded = Math.round(x);
        System.out.print("First number is by java funcs, second is by Math funcs.");
        System.out.printf("Whole part: %f and %f\nDecimal part: %f and %f\n",whole_part1, whole_part2, decimal_part1, decimal_part2);
        System.out.printf("Max lesser: %f and %f\nMin greater: %f and %f\n",max_lesser1, max_lesser2, min_greater1, min_greater2);
        System.out.printf("Rounded: %.0f and %f", x ,rounded);
    }
}
