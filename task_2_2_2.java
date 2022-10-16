import java.util.Scanner;

public class task_2_2_2 {
    public static void main(String[] args) {
        System.out.println("Input int: ");
        int number = new Scanner(System.in).nextInt();
        System.out.printf("%d in Binary is %s", number, Integer.toBinaryString(number));
        while (number != 0) {
            number = number >> 1;
            System.out.printf("\n%d in Binary is %s", number, Integer.toBinaryString(number));
        }
    }
}
