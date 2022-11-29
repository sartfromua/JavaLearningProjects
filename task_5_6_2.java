package HW_11;

import java.io.FileReader;
import java.util.Scanner;

public class task_5_6_2 {
    public static int countEvenInFIle(String filename) {
        try (Scanner file = new Scanner(new FileReader(filename))) {
            int i = 0;
            while (file.hasNextLong()) {
                long number = file.nextLong();
                if (number % 2 == 0) i++;
            }
            file.close();
            return i;
        } catch (Exception e) {
            return -1;
        }
    }

    public static boolean isSquare(long number) {
        return Math.abs(number - Math.pow((int) Math.sqrt(number),2)) < 0.000001;
    }

    public static int countSquaresOfOddsInFIle(String filename) {
        try (Scanner file = new Scanner(new FileReader(filename))) {
            int i = 0;
            while (file.hasNextLong()) {
                long number = file.nextLong();
                if (number % 2 == 1 && isSquare(number)) i++;
            }
            file.close();
            return i;
        } catch (Exception e) {
            return -1;
        }
    }

    public static long differenceMaxEvenAndMinOddInFIle(String filename) {
        try (Scanner file = new Scanner(new FileReader(filename))) {
            long maxEven = Integer.MIN_VALUE, minOdd = Integer.MAX_VALUE;
            while (file.hasNextLong()) {
                long number = file.nextLong();
                if (number % 2 == 0 && number > maxEven) maxEven = number;
                else if (number % 2 == 1 && number < minOdd) minOdd = number;
            }
            file.close();
            return maxEven - minOdd;
        } catch (Exception e) {
            return Integer.MAX_VALUE;
        }
    }

    public static long maxLengthOfGrowingSequenceInFIle(String filename) {
        try (Scanner file = new Scanner(new FileReader(filename))) {
            long prev = Integer.MAX_VALUE, len = 1, maxLen = 0;
            while (file.hasNextLong()) {
                long number = file.nextLong();
                if (number > prev) len++;
                else len = 1;
                if (len > maxLen) maxLen = len;
                prev = number;
            }
            file.close();
            return maxLen;
        } catch (Exception e) {
            return Integer.MAX_VALUE;
        }
    }

    public static void main(String[] args) {
        System.out.print("countEvenInFIle: " + countEvenInFIle("src/HW_11/task_5_6_2_integers") +
                "\ncountSquaresOfOddsInFIle: " + countSquaresOfOddsInFIle("src/HW_11/task_5_6_2_integers") +
                "\ndifferenceMaxEvenAndMinOddInFIle: " + differenceMaxEvenAndMinOddInFIle("src/HW_11/task_5_6_2_integers") +
                "\nmaxLengthOfGrowingSequenceInFIle: " + maxLengthOfGrowingSequenceInFIle("src/HW_11/task_5_6_2_integers"));
    }
}
