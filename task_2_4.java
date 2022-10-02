import java.util.Scanner;

public class task_2_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите градусы С: ");
        double celsius;
        celsius = in.nextDouble();
        double fahrenheit = 9*celsius/5 + 32;
        System.out.printf("F=%f", fahrenheit);
    }
}
