import java.util.Scanner;

public class task_5_6_5 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String str = scan.nextLine();
        str = str.replaceAll("\\bsmall\\b", "very small");
        str = str.replaceAll("\\bSmall\\b", "Very small");
        str = str.replaceAll("\\blarge\\b", "very large");
        str = str.replaceAll("\\bLarge\\b", "Very large");
        System.out.println(str);
    }
}
