package CW_5;

public class task_3_3_4 {
    public static class Printer{
        Printer() {
            System.out.println("Creating object of class Printer");
        }

        Printer(String line) {
            System.out.println("Creating object of class Printer with message: " + line);
        }
    }

    public static void main(String[] args) {
        Printer p1, p2 = new Printer(), p3 = new Printer("Any message");
    }
}
