import java.util.Scanner;

public class task_5_6_6 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scan.nextLine();
        StringBuffer s1 = new StringBuffer(s);
        s1.append("that we use to ilustrate the methods of class StringBuffer");
        System.out.println("new sentence: "+s1);
    }
}
