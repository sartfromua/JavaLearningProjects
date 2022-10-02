import java.util.Scanner;
import java.lang.Math;

public class task_2_6 {
    public static void main(String[] args){
        System.out.println("Богдан Бакун завдання 2.6\n");
        System.out.println("Введите кол-во рандомных чисел: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i=0; i<n; i++) {
            System.out.printf("%f ", Math.random()*200 - 100);
        }
        for (int i=0; i<n; i++) {
            System.out.printf("\n%f", Math.random()*200 - 100);
        }
    }
}
