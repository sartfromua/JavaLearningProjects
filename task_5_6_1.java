import java.util.Scanner;
import java.util.regex.*;

public class task_5_6_1 {

    static Scanner scan = new Scanner(System.in);

    public static int numberWords(String s) {
        Pattern p = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = p.matcher(s);
        int res = 0;
        while (matcher.find()) {
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        String str = scan.nextLine();
        System.out.println(numberWords(str));
    }
}
