import java.util.Scanner;

public class task_5_6_4 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String str = scan.nextLine();
        str = str.replaceAll("\\ba\\b|\\ban\\b", " ");
        str = str.replaceAll("\\bAn\\b|\\ban\\b|\\bA\\b|\\ba\\b", "");
        System.out.println(str);
    }
}
