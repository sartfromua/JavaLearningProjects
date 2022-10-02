public class task_2_2_3 {

    static String charToBin(char c) {
        String binary = Integer.toBinaryString(c);
        return binary;
    }

    public static void main(String[] args) {
        char c = '5';
        System.out.println(charToBin(c));
    }
}
