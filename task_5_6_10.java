import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Зробив на парi !!!!

public class task_5_6_10 {
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

    public static int numberOfSpecialWords(String s, String word) {
        Pattern p = Pattern.compile("\\b"+word.toLowerCase()+"\\b");
        Matcher matcher = p.matcher(s.toLowerCase());
        int res = 0;
        while (matcher.find()) {
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        String text = scan.nextLine();
        int words = 0;
        for (String word: args) words += numberOfSpecialWords(text, word);
        System.out.println(((double) words/ numberWords(text)));
    }
}
