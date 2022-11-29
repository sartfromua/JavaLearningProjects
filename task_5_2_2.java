package HW_10;

import java.util.Scanner;

public class task_5_2_2 {
    public static int findFirstChar(String line, char chr) {
        int i = 0;
        for (char symb: line.toCharArray()) {
            if (symb == chr) return i;
            i++;
        }
        return -1;
    }

    public static int findLastChar(String line, char chr) {
        int i = 0, j = -1;
        for (char symb: line.toCharArray()) {
            if (symb == chr) j = i;
            i++;
        }
        return j;
    }

    public static int countChars(String line, char chr) {
        int i = 0;
        for (char symb: line.toCharArray()) {
            if (symb == chr) i++;
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input line: ");
        String line = scan.nextLine();
        System.out.println("First comma: " + findFirstChar(line, ',') + " or " + line.indexOf(",") +
                "\nLast comma: " + findLastChar(line, ',') + " or " + line.lastIndexOf(",") +
                "\nCommas in line: " + countChars(line, ','));
    }
}
