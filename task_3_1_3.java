package CW_HW_4;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class task_3_1_3 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input n: ");
        int n = scan.nextInt();
        double[] numbers = new double[n];
        for (int i=0; i<n; i++) {
            System.out.printf("n[%d] = ", i);
            numbers[i] = scan.nextDouble();
        }

        double mean = Arrays.stream(numbers).sum() / n;
        double ssd = 0;

        for (double x: numbers) ssd += Math.pow(x-mean, 2);
        ssd /= n-1;
        ssd = Math.sqrt(ssd);
        System.out.printf("Mean: %f, Ssd: %f", mean, ssd);
    }
}

