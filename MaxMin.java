package CW_HW_4;

import java.util.Scanner;

public class MaxMin {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input int numbers: ");
        String line = scan.nextLine();
        String[] numbers = line.split(" ");
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (String numb: numbers) {
            int n = Integer.parseInt(numb);
            if (min > n) min = n;
            if (max < n) max = n;
        }
        System.out.printf("Max int: %d, Min int: %d", max, min);
    }
}
