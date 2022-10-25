package HW_4;

public class task_3_1_9 {

    static boolean uniqDigits(int number) {
        char[] line = Integer.toString(number).toCharArray();
        for (int i=0; i<line.length; i++) {
            for (int j=i+1; j<line.length; j++) {
                if (line[i] == line[j]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] number = {1, 2, 6, 11, 12, 56, 67, 87, 667890, 88};
        int max_n = Integer.MIN_VALUE;
        for (int n: number) {
            if (uniqDigits(n) && n>max_n) max_n = n;
        }
        System.out.print(max_n);
    }
}
