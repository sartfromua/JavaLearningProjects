package CW_HW_4;

public class NPerLine {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.print("   ");
        for (int i=1; i<1000; i++) {
            for (int j = 0; j < 3 - (int) Math.log10((double) i); j++) {System.out.print(" ");}
            System.out.print(i);
            if (i % n == n-1) {
                System.out.println("\n");
            }
        }
    }
}
