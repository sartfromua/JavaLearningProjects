import java.util.Scanner;

public class task_3_5 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //double[] y = new double[5];
        //int[] x = new int[5];
        int[] x = {1, 2, 31, 4, 5};
        double[] y = {1.2, 3.56, 0.123, 2, 4.1235};
//        System.out.print("Введите 5 целых чисел: ");
//        for (int i=0; i<5; i++) {
//            x[i] = scan.nextInt();
//        }
//        System.out.print("Введите 5 действительных чисел: ");
//        for (int i=0; i<5; i++) {
//            y[i] = scan.nextDouble();
//        }
        System.out.printf(" x |  %2d  |  %2d  |  %-2d  |  %2d  |  %2d  |\n", x[0], x[1], x[2], x[3], x[4]);
        System.out.print(" - | -  - | -  - | -  - | -  - | -  - |\n");
        System.out.printf(" x | %2.2f | %2.2f | %2.2f | %2.2f | %2.2f |", y[0], y[1], y[2], y[3], y[4]);
    }
}
