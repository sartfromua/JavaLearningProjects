package CW_HW_3;

import java.util.Scanner;

public class task_2_2_6 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int numb = -1;
        while (numb < 1) {
            System.out.print("n = ");
            numb = scan.nextInt();
        }

        String str =Integer.toBinaryString(numb);
        char prev = '0';
        int counter = 0;
        for (char symb: str.toCharArray()) {
            if (symb == '1' && prev == '1') counter++;
            prev = symb;
        }
        System.out.printf("There are %d of '11' in %s (%d)", counter, str, numb);
    }
}
