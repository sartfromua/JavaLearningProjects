package CW_HW_4;

import java.util.Scanner;

public class task_3_1_6 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input int numbers: ");
        String line = scan.nextLine();
        String[] numbers = line.split(" ");
        int min_len = Integer.MAX_VALUE;
        for (String numb : numbers) {
            if (numb.length() < min_len) min_len = numb.length();
        }
        System.out.print("Shortest numbers: ");
        for (String numb : numbers) {
            if (numb.length() == min_len) System.out.print(numb + " ");
        }
    }
}
