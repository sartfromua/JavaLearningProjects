import java.util.Random;

public class task_2_3_2 {
    static Random rand = new Random();

    public static void main(String[] args) {
        int bound = 20;
        for (int i = 0; i<25; i++) {
            int num = rand.nextInt( bound);
            int comp = rand.nextInt(bound);
            if (num > comp) System.out.printf("%d > %d\n", num, comp);
            else if (num < comp) System.out.printf("%d < %d\n", num, comp);
            else System.out.printf("%d = %d\n", num, comp);
        }
    }
}