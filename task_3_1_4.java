package CW_HW_4;

import java.util.Scanner;

public class task_3_1_4 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input int numbers: ");
        String line = scan.nextLine();
        String[] numbers = line.split(" ");
        int prev = Integer.MIN_VALUE, row_counter = 1, max_value = Integer.MIN_VALUE, max_count = 0;
        for (String numb: numbers) {
            int n = Integer.parseInt(numb);

            if (n == prev) row_counter++;
            else row_counter = 1;

            if (max_count < row_counter) {
                max_value = n;
                max_count = row_counter;
            } else if (max_count == row_counter && n > max_value) max_value = n;
            prev = n;
        }
        System.out.printf("Most common number: %d, repeats: %d", max_value, max_count);
    }
}
