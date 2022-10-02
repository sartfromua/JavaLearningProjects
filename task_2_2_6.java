import java.util.Random;

enum Coin {
    Eagle, Tails, No
}

public class task_2_2_6 {

    static Random rnd = new Random();

    static Coin getCoin() {
        if (rnd.nextInt(2) ==0) {
            return Coin.Eagle;
        }
        return Coin.Tails;
    }

    static int playAlice() {
        Coin previous = Coin.No;
        Coin current = getCoin();
        int count = 1;

        while (true) {
            count++;
            current = getCoin();
            if (previous == Coin.Eagle && current == Coin.Eagle) break;
            previous = current;
        }

        return count;
    }

    static int playBob() {
        Coin previous = Coin.No;
        Coin current = getCoin();
        int count = 1;

        while (true) {
            count++;
            current = getCoin();
            if (previous == Coin.Eagle && current == Coin.Tails) break;
            previous = current;
        }

        return count;
    }

    public static void main(String[] args) {
        final int N = 10000;
        int i = 0;
        int winsBob = 0;
        do {
            int a = playAlice();
            int b = playBob();
            winsBob += (a<b)?1:0;
            i++;
        } while (i<N);

        System.out.println("Bob wins ratio: " + ((double) winsBob/N));
        System.out.println("Should be: " + (39.0/121));
    }
}
