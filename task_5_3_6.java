package HW_10;

import java.util.Scanner;

public class task_5_3_6 {
    public static String inversedString(String line) {
        String res = "";
        for (char s: line.toCharArray()) {
            res = s + res;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input line: ");
        String line = scan.nextLine();
        System.out.print("Inversed line: " + inversedString(line));
    }
}
