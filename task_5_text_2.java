import java.io.FileReader;
import java.util.Scanner;

public class task_5_text_2 {

    public static int countEmptyLines(String filename) throws Exception {
        FileReader fr = new FileReader(filename);
        Scanner file = new Scanner(fr);

        int res = 0;
        while (file.hasNext()) {
            String line = file.nextLine();
            line.replaceAll(" ", "");
            if ("".equals(line)) res++;
        }
        fr.close();
        return res;
    }

    public static int countMaxLine(String filename) throws Exception {
        FileReader fr = new FileReader(filename);
        Scanner file = new Scanner(fr);

        int maxL = 0;
        while (file.hasNext()) {
            String line = file.nextLine();
            if (line.length() > maxL) maxL = line.length();
        }
        fr.close();
        return maxL;
    }

    public static void main(String[] args) {
        String filename = "src/text1.txt";
        try {
            System.out.println("Empty lines in file: " + Integer.toString(countEmptyLines(filename)));
            System.out.println("Max length of line in file: " + Integer.toString(countMaxLine(filename)));
        } catch (Exception e) {
            System.out.println("There is no such file :(");
        }

    }
}
