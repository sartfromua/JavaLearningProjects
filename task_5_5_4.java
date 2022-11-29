package HW_11;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class task_5_5_4 {
    public static boolean rewriteFromTxtToTxtWithReplacement(String fromFileName, String toFileName,
                                                             String replaceWhat, String replaceTo) {
        try {
            FileReader fr = new FileReader(fromFileName);
            Scanner file = new Scanner(fr);
            FileWriter fileWriter = new FileWriter(toFileName);
            while (file.hasNextLine()) {
                String line = file.nextLine();
                line = line.replaceAll(replaceWhat, replaceTo);
                fileWriter.write(line + "\n");
            }
            fr.close();
            fileWriter.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean rewriteInverted(String fromFileName, String toFileName) {
        try {
            FileReader fr = new FileReader(fromFileName);
            Scanner file = new Scanner(fr);
            StringBuilder line = new StringBuilder();
            while (file.hasNextLine()) {
                line.append(file.nextLine() + "\n");
            }
            line.reverse();
            FileWriter fileWriter = new FileWriter(toFileName);
            fileWriter.write(line.toString());
            fr.close();
            fileWriter.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        rewriteFromTxtToTxtWithReplacement("src/HW_11/task_5_5_4_in", "src/HW_11/task_5_5_4_out",
                "0", "1");
        rewriteInverted("src/HW_11/task_5_5_4_in", "src/HW_11/task_5_5_4_out_2");
    }
}
