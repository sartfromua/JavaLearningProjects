package CW_5;

public class task_3_3_2 {

    public static class testClass{
        String line1 = "Look! ";
        String line2;

        testClass(int l){
            line2 = "It's Mario!";
        }

        testClass(){}
    }

    public static void main(String[] args) {
        testClass cl = new testClass(), cl1 = new testClass(2);
        System.out.println(cl.line1 + cl.line2);
        System.out.println(cl1.line1 + cl1.line2);
    }
}
