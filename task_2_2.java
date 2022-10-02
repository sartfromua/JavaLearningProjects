import java.util.Scanner;
import java.lang.Math;

public class task_2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1 = in.nextInt();
        double n2 = in.nextInt();
        System.out.printf("%.0f имеет %.0f разрядов", n1, Math.log10(n1)+1);
        System.out.printf("\n%.0f имеет %.0f разрядов", n2, Math.log10(n2)+1);
        double aver_harm = 2 / (1/n1 + 1/n2);
        System.out.printf("\nAverage harmonical: %.2f", aver_harm);
    }
}
