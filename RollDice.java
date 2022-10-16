import java.util.Random;

public class RollDice {
    static Random rand = new Random();

    public static int roll() {
        return rand.nextInt(1, 7);
    }

    public static void main(String[] args) {
        System.out.printf("%d", roll());
    }
}
