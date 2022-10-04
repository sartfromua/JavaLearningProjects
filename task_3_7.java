import java.lang.Math;

public class task_3_7 {
    public static void main(String[] args) {
        double r = 117294, m1 = 182654871226124L, m2 = 250, gamma = 6.673 * Math.pow(10, -11);
        double F = gamma * m1 * m2 / r;
        System.out.printf("F = %e", F);
    }
}
